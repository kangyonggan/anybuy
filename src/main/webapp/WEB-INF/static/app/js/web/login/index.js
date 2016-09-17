$(function () {
    Login.init();
});

/**
 * 登录相关-页面控制
 * @type {Login}
 */
var Login = new Login();
function Login() {
    /**
     * 页面初始化
     */
    this.init = function () {
        Login.loginValidator();
    };

    /**
     * 登录输入验证
     */
    this.loginValidator = function () {
        $('#login-form').validate({
            submitHandler:function(form){
                Login.login();
            },
            rules: {
                "mobile": {
                    required: true	//必填
                },
                "password": {
                    required: true,	//必填
                    minlength: 1,
                    maxlength: 64	//最大输入长度
                }
            },
            messages: {
                "mobile": {
                    required: "请输入手机号"
                },
                "password": {
                    required: "请输入密码",	//必填
                    minlength: "长度不可少于1",
                    maxlength: "密码过长"
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
     * 登录
     */
    this.login = function () {
        var $login = $('#login');
        var mobile = $("#mobile-input").val();
        var password = $("#password-input").val();

        var user  = {
            mobile: mobile,
            password: password
        };
        $login.attr("disabled", "disabled");
        console.log("login...");
        $.post({
            url: "/login",
            dataType: 'json',
            data: user,
            success: function (response) {
                $login.removeAttr("disabled");
                if (response.status == 'fail') {
                    App.errorMsg(response.message);
                } else if (response.status == "success") {
                    window.location.href = response.message;
                }
            },
            error: function () {
                App.errorMsg("服务器内部错误，请稍后再试。");
            }
        });
    };
}