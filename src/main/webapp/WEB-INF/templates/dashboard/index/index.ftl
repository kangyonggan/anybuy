<#assign title="商品管理"/>

<#assign goodsName = RequestParameters.goodsName!'' />
<#assign sortCode = RequestParameters.sortCode!'' />

<@override name="content">
<div class="col-xs-10">
    <form class="form-inline" method="get" novalidate>
        <input type="text" class="form-control" name="goodsName" value="${goodsName}" placeholder="商品名称"/>

        <select name="sortCode">
            <option value="">==选择商品分类==</option>
            <#list sorts as sort>
                <option value="${sort.sortCode}">${sort.sortName}</option>
            </#list>
        </select>

        <button class="btn">
            搜索
        </button>

        <div class="pull-right">
            <a href="${ctx}/dashboard/goods/create" class="btn">添加商品</a>
        </div>
    </form>
</div>

<div class="space-10"></div>

<div class="col-xs-10">
    <table class="table table-hover table-bordered">
        <thead>
            <tr>
                <th>商品ID</th>
                <th>商品名称</th>
                <th width="45%">商品描述</th>
                <th>商品价格</th>
                <th>商品分类</th>
                <th>已删除</th>
                <th>添加时间</th>
            </tr>
        </thead>
        <tbody>
            <#if (page.list)?size == 0>
                <tr>
                    <td colspan="10">
                        <div class="empty">暂无查询记录</div>
                    </td>
                </tr>
            <#else>
                <#list page.list as goods>
                    <#include "table-tr.ftl"/>
                </#list>
            </#if>
        </tbody>
    </table>
</div>
</@override>

<@override name="script">
</@override>

<@extends name="../layout.ftl"/>
