$(function () {
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
            var start = 0;  //初始值
            var end = 100;  //结束值
            var selection = $slider.slider("value");    //用户拖拽值
            if(end === selection) {
                $slider.slider( "disable" );
                $registerBtn.removeClass("btn-disabled").removeAttr("disabled");
                $progressBar.text("验证通过").addClass("text-center");
                $progressBar.css({
                    "color": "#FFFFFF",
                    "opacity": "1.0",
                    "filter": "alpha(opacity=60)"
                });
                $slider.find("span").text("");
            } else {
                $registerBtn.addClass("btn-disabled").attr("disabled");
                $slider.slider("value", start);
                $progressBar.width(start);
            }
        }
    });
});