<tr id="goods-${goods.id}">
    <td>${goods.id}</td>
    <td>${goods.goodsName}</td>
    <td>${goods.goodsDesc}</td>
    <td>${goods.price?number}元</td>
    <td>${goods.sortName}</td>
    <td><#if goods.isDeleted==0>否<#else>是</#if></td>
    <td>${goods.createdTime?datetime}</td>
    <td>
        <a href="${ctx}/sort/${goods.sortCode}/goods/${goods.id}">
            查看
        </a>
        <a href="${ctx}/dashboard/goods/${goods.id}/edit">
            编辑
        </a>
        <a class="delete-goods" title="${goods.goodsName}"
           data-url="${ctx}/dashboard/goods/delete/${goods.id}">
            删除
        </a>
    </td>
</tr>