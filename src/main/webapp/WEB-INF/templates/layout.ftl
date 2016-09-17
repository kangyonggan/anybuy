<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>${title!'某宝'}</title>
    <link rel="icon" type="image/ico" href="${ctx}/static/app/favicon.ico">
    <#--<link rel="stylesheet" href="${ctx}/static/lib/layer/skin/layer.css"/>-->
    <#--<link rel="stylesheet" href="${ctx}/static/lib/fontawesome/css/font-awesome.min.css">-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>

    <script>var ctx = '${ctx}';</script>
<@block name="app-style"/>
</head>
<body>

<@block name="app-body"/>


<script src="${ctx}/static/lib/jquery/jquery-3.1.0.min.js"></script>
<script src="${ctx}/static/lib/layer/layer.js"></script>
<script src="${ctx}/static/app/js/app.js"></script>
<@block name="app-script"/>
</body>
</html>
