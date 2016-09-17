<#assign title="添加商品"/>

<@override name="content">
<div class="col-xs-10">
    <form action="${ctx}/dashboard/goods/${goods.id???string('update', 'save')}" method="post"
          enctype="multipart/form-data" role="form">

        <#if goods.id??><input name="id" value="${goods.id}" type="hidden"/></#if>

        <div class="form-group">
            <label>商品分类</label>
            <select name="sortCode">
                <option value="">==选择商品分类==</option>
                <#list sorts as sort>
                    <option value="${sort.sortCode}" <#if goods.id?? && sort.sortCode==goods.sortCode>selected</#if>>${sort.sortName}</option>
                </#list>
            </select>
        </div>
        <div class="form-group">
            <label>商品名称</label>
            <input type="text" name="goodsName" value="${goods.goodsName!''}" class="form-control" placeholder="商品名称不能为空">
        </div>
        <div class="form-group">
            <label>商品描述</label>
            <textarea name="goodsDesc" class="form-control" placeholder="商品描述不能为空">${goods.goodsDesc!''}</textarea>
        </div>
        <div class="form-group">
            <label>价格</label>
            <input type="number" name="price" value="${goods.price!''}" class="form-control" placeholder="商品价格不能为空">
        </div>

        <#if !goods.id??>
            <div class="form-group">
                <label>商品封面</label>
                <input type="file" name="picture">
            </div>
        </#if>

        <button type="submit" class="btn">提交</button>
    </form>
</div>
</@override>

<@extends name="../layout.ftl"/>
