<#assign title="某宝网 - 登录界面"/>

<@override name="style">
    <link rel="stylesheet" href="${ctx}/static/app/css/web/login.css">
</@override>

<@override name="app-content">

<div id="header">
    <div class="log">
        <a href="http://www.taobao.com" class="taobao-log-warp">
            <img class="taobao-log" src="${ctx}/static/app/img/taobao-log.png">
        </a>

        <a href="#" class="login-advice">
            <i class="fa fa-fw fa-comments fa-lg taobao-color"></i>
            <span>
              "登录界面"改进建议
            </span>
        </a>
    </div>

</div>

<div id="content">
    <div class="login-box-warp">

        <div class="login-box">
            <a href="http://www.taobao.com" class="taobao-log-warp">
                <img class="taobao-log" src="${ctx}/static/app/img/taobao-log.png">
            </a>

            <b class="f18">密码登录</b>
            <form id="login-form">
                <div class="username-field">
                    <label><i class="fa fa-fw fa-2x fa-user"></i></label>
                    <input placeholder="手机名/会员名/邮箱">
                </div>
                <div class="password-field">
                    <label><i class="fa fa-fw fa-2x fa-lock"></i></label>
                    <input>
                </div>
            </form>
            <button id="login">登录</button>
            <ul class="extra-login">
                <li>
                    <a><i class="fa fa-fw fa-weibo weibo-color"></i> 新浪登录</a>
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    <a><i class="fa fa-fw fa-wechat wechat-color"></i> 微信登录</a>
                </li>
            </ul>
            <div class="login-links text-right">
                <a href="#">忘记密码</a>
                &nbsp;&nbsp;
                <a href="#">免费注册</a>
            </div>
        </div>
    </div>
</div>

</@override>


<@override name="script">

</@override>

<@extends name="../layout.ftl"/>
