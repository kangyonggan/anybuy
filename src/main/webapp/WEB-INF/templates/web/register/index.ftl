<#assign title="某宝网 - 注册界面"/>

<@override name="style">
<link rel="stylesheet" href="${ctx}/static/app/css/web/register/index.css">
<link rel="stylesheet" href="${ctx}/static/app/css/taobao-base.css">
<link rel="stylesheet" href="${ctx}/static/lib/select2/css/select2.min.css">
<link rel="stylesheet" href="${ctx}/static/lib/jqueryui/css/jquery-ui.min.css">

</@override>

<@override name="app-content">

<div id="register-agree-on">
    <div class='ks-dialog-header'>
        <h3 style="display: inline-block;">注册协议</h3>
        <a class="pull-right f22 text-muted" href="${ctx}/">&times;</a>
    </div>

    <div class='ks-dialog-body'>
        <p><strong>【审慎阅读】</strong>您在申请注册流程中点击同意前，应当认真阅读以下协议。<strong style='text-decoration: underline'>请您务必审慎阅读、充分理解协议中相关条款内容，其中包括：</strong>
        </p>
        <p>1、<strong style='text-decoration: underline'>与您约定免除或限制责任的条款；</strong></p>
        <p>2、<strong style='text-decoration: underline'>与您约定法律适用和管辖的条款；</strong></p>
        <p>3、<strong style='text-decoration: underline'>其他以粗体下划线标识的重要条款。</strong></p>
        <p>如您对协议有任何疑问，可向平台客服咨询。</p>
        <p><strong>【特别提示】</strong>当您按照注册页面提示填写信息、阅读并同意协议且完成全部注册程序后，即表示您已充分阅读、理解并接受协议的全部内容。如您因平台服务与淘宝发生争议的，适用《淘宝平台服务协议》处理。如您在使用平台服务过程中与其他用户发生争议的，依您与其他用户达成的协议处理。
        </p>
        <p><strong style='text-decoration: underline'>阅读协议的过程中，如果您不同意相关协议或其中任何条款约定，您应立即停止注册程序。</strong></p>


        <p><a class="taobao-color" href='http://www.taobao.com/go/chn/member/agreement.php' target='_blank'>《淘宝服务协议》</a>
        </p>
        <p><a class="taobao-color" href='http://www.taobao.com/go/chn/tb-fp/2014/law.php'
              target='_blank'>《法律声明及隐私权政策》</a></p>
        <p><a class="taobao-color" href='http://ab.alipay.com/agreement/contract.htm' target='_blank'>《支付宝服务协议》</a></p>

        <p class="text-center">
            <button class='btn btn-large' type='button' id='agree-on-btn'>同意协议</button>
        </p>
    </div>
</div>

<div id="page">
    <div id="header">
        <div class="logo">
            <a href="${ctx}/" class="taobao-log-warp">
                <img class="taobao-log" src="../static/app/img/taobao-log.png">
            </a>
            <span class="f22">用户注册</span>
        </div>

    </div>

    <div class="steps">
        <ol>
            <li class="active">
                <div class="step step-num"><i>1</i></div>
                <span>设置用户名</span>
            </li>
            <li>
                <div class="step step-num"><i>2</i></div>
                <span>填写账号信息</span>
            </li>
            <li>
                <div class="step step-num"><i>3</i></div>
                <span>设置支付方式</span>
            </li>
            <li>
                <i class="step-ok fa fa-fw fa-lg fa-check-circle"></i>
                <span>注册成功</span>
            </li>
        </ol>
        <div class="tsl-switcher">
            <a href="#" class="chinese">中文</a> |
            <a href="#" class="english">英文</a>
        </div>
    </div>

    <div class="content">

        <form id="register-mobile-form">
            <div class="form-list form-main-list">
                <div class="form-group">
                    <div class="form-item">
                        <span class="form-label">手机号</span>
                        <select class="mobile-select" style="width: 150px;">
                            <option value="china">中国大陆 +86</option>
                            <option value="china_tw">中国台湾 +886</option>
                        </select>
                        <input placeholder="请输入您的手机号码" id="mobile-input">
                    </div>

                    <div class="form-item">
                        <span class="form-label">验证</span>
                        <div class="verify-slider-warp">
                            <div id="verify-slider" class="f12 text-center">
                                <span>请按住滑块,拖动到最右边</span>
                            </div>
                            <div id="verify-progress-bar">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-item">
                        <button class="btn btn-large btn-disabled" disabled id="register-mobile-button">
                            下一步
                        </button>
                    </div>
                    <div class="form-item f12">
                        <a href="#" class="user-email-register">切换成企业账户注册</a>
                    </div>
                </div>
            </div>
        </form>
    </div>

    <div class="user-suggest taobao-color text-right">
        <i class="fa fa-fw fa-commenting taobao-color"></i>"淘宝注册"改进建议
    </div>

</div>

</@override>


<@override name="script">
<script src="${ctx}static/lib/select2/js/select2.min.js"></script>
<script src="${ctx}static/lib/jqueryui/js/jquery-ui.min.js"></script>
<script src="${ctx}static/app/js/web/register/index.js"></script>
</@override>

<@extends name="../layout.ftl"/>


