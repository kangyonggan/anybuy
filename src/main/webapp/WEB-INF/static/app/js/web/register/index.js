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