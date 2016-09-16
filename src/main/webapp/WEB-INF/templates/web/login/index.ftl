<#assign title="某宝网 - 登录界面"/>

<@override name="app-style">
    <link rel="stylesheet" href="${ctx}/static/app/css/web/login/index.css">
    <link rel="stylesheet" href="${ctx}/static/app/css/web/include/login-footer.css">
</@override>

<@override name="app-body">

<div id="header">
    <div class="log">
        <a href="${ctx}/" class="taobao-log-warp" title="某宝网">
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
                    <input id="mobile-input" placeholder="手机名/会员名/邮箱">
                </div>
                <div class="password-field">
                    <label><i class="fa fa-fw fa-2x fa-lock"></i></label>
                    <input id="password-input" placeholder="请输入密码">
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

    <#include "../include/login-footer.ftl">

</@override>


<@override name="app-script">

</@override>

<@extends name="../../layout.ftl"/>
