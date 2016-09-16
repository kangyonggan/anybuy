$(function () {

    /**
     * 导航条->用户信息
     */
    hoverListenter("#user-info", "#user-info-panel");

    /**
     * 导航条->消息
     */
    hoverListenter("#user-message", "#user-message-panel");

    /**
     * 导航条->我的某宝
     */
    hoverListenter("#my-anybuy", "#my-anybuy-panel");

    /**
     * 导航条->购物车
     */
    hoverListenter("#my-cart", "#my-cart-panel");

    /**
     * 导航条->收藏夹
     */
    hoverListenter("#my-star", "#my-star-panel");

    /**
     * 导航条->联系客服
     */
    hoverListenter("#contact-scsr", "#contact-scsr-panel");

    /**
     * 导航条->卖家中心
     */
    hoverListenter("#seller-center", "#seller-center-panel");

    /**
     * 导航条->网站导航
     */
    hoverListenter("#site-nav", "#site-nav-panel");

    /**
     * 鼠标悬浮监听
     */
    function hoverListenter(btnId, showPanelId) {
        $(btnId + ", " + showPanelId).hover(function () {
            //鼠标悬浮
            $(showPanelId).removeClass("hidden");
            $(btnId).css("background", "#fff");
        }, function () {
            //鼠标离开
            $(showPanelId).addClass("hidden");
            $(btnId).css("background", "transparent");
        });
    }
});