<@override name="app-style">
<link rel="stylesheet" href="${ctx}static/app/css/web/common.css"/>
<link rel="stylesheet" href="${ctx}static/app/css/web/navbar.css"/>
<link rel="stylesheet" href="${ctx}static/app/css/web/footer.css"/>
    <@block name="style"/>
</@override>

<@override name="app-body">
    <#include "include/navbar.ftl">

    <@block name="app-content"/>

    <#include "include/footer.ftl">
</@override>

<@override name="app-script">
    <@block name="script"/>
</@override>

<@extends name="../layout.ftl"/>
