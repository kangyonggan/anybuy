$(function () {

    Register.init();

});

var Register = new Register();
function Register() {
    this.init = function () {
        /**
         *  同意协议
         */
        $("#agree-on-btn").on('click', function () {
            $("#register-agree-on").css("display", "none");
        });

        /**
         * 手机号 - 下拉框
         */
        $("select.mobile-select").select2();

        /**
         * 验证 - 滑动滚动条
         * @type {any}
         */
        var $slider = $("#verify-slider");  //验证滑动条
        Register.sliderVerify($slider);

        Register.registerMobileValidator();
    };

    /**
     * 注册按钮点击
     */
    this.registerMobileClick = function () {
        var $registerBtn = $("#register-mobile-button");    //注册按钮
        var mobile = $("#mobile-input").val();

        $registerBtn.attr("disabled", "disabled");
        $.post({
            url: "/register/verify/mobile",
            dataType: 'json',
            data: {
                mobile: mobile
            },
            success: function (response) {
                $registerBtn.removeAttr("disabled");
                if (response.status == 'fail') {
                    App.errorMsg(response.message);
                } else if (response.status == "success") {
                    App.successMsg("验证成功");
                }
            },
            error: function () {
                App.errorMsg("服务器内部错误，请稍后再试。");
            }
        });

    };

    /**
     * 注册手机号验证
     */
    this.registerMobileValidator = function () {
        $('#register-mobile-form').validate({
            submitHandler:function(form){
                Register.registerMobileClick();
            },
            rules: {
                "mobile": {
                    required: true,	//必填
                    isChinaMobile: true  //必须是手机号
                }
            },
            messages: {
                "mobile": {
                    required: "请输入手机号",
                    isChinaMobile: "手机号码输入错误"
                }
            },
            errorElement: "span",
            errorPlacement: function ( error, element ) {
                error.addClass( "help-block" ).css('color', '#f40');
                error.insertAfter( element );
            }
        });
    };




    /**
     * 拖动滑块进行验证
     * @param $slider 验证滑块
     */
    this.sliderVerify = function ($slider) {
        var $registerBtn = $("#register-mobile-button");    //注册按钮
        var $progressBar = $("#verify-progress-bar");   //进度条
        $slider.slider({
            animate: "slow",
            slide: function( event, ui ) {
                var selection = $slider.slider("value");    //用户拖拽值
                var percent = (selection/100);
                var actualWidth = percent*$slider.width();
                $progressBar.width(actualWidth);
            },
            stop: function( event, ui ) {
                var end = 100;  //结束值
                var selection = $slider.slider("value");    //用户拖拽值
                if(end === selection) {
                    $.post({
                        url: "/register/verify",
                        success: function (result) {
                            Register.verifySuccess($registerBtn, $slider, $progressBar);
                        },
                        error: function () {
                            App.errorMsg("服务器内部错误，请稍后再试。");
                            Register.verifyFail($registerBtn, $slider, $progressBar);
                        }
                    });
                } else {
                    Register.verifyFail($registerBtn, $slider, $progressBar);
                }
            }
        });
    };

    /**
     * 验证成功
     * @param $registerBtn  下一步按钮
     * @param $slider       验证滑块
     * @param $$progressBar 成功进度条
     */
    this.verifySuccess = function ($registerBtn, $slider, $progressBar) {
        $slider.slider( "disable" );
        $registerBtn.removeClass("btn-disabled").removeAttr("disabled");
        $progressBar.text("验证通过").addClass("text-center");
        $progressBar.css({
            "color": "#FFFFFF",
            "opacity": "1.0",
            "filter": "alpha(opacity=60)"
        });
        $slider.find("span").text("");
    };


    /**
     * 验证失败
     * @param $registerBtn  下一步按钮
     * @param $slider       验证滑块
     * @param $$progressBar 成功进度条
     */
    this.verifyFail = function ($registerBtn, $slider, $progressBar) {
        var start = 0;  //初始值
        $registerBtn.addClass("btn-disabled").attr("disabled");
        $slider.slider("value", start);
        $progressBar.width(start);
    };
}