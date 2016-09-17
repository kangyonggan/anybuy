<@override name="app-style">
<link rel="stylesheet" href="${ctx}/static/lib/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="${ctx}/static/app/css/dashboard/base.css"/>
    <@block name="style"/>
</@override>

<@override name="app-body">
<div class="container">
    <div class="space-20"></div>
    <@block name="content"/>
</div>
</@override>

<@override name="app-script">
    <@block name="script"/>
</@override>

<@extends name="../layout.ftl"/>
