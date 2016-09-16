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
        $.post({
            url: "/login",
            data: user,
            success: function(result) {
                $login.removeAttr("disabled");

                //回调函数处理。。。
                // result = eval('(' + result + ')');
                // if(result.error) {
                //     layer.msg(result.error);
                // } else {
                //     layer.msg("注册成功, 快去登录吧~");
                // }
            }
        });


    };
}