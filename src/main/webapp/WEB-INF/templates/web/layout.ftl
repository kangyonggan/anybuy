<@override name="app-style">
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
