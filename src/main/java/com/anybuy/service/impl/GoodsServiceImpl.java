package com.anybuy.service.impl;

import com.anybuy.model.Goods;
import com.anybuy.model.ShiroUser;
import com.anybuy.model.Shop;
import com.anybuy.model.Sort;
import com.anybuy.service.GoodsService;
import com.anybuy.service.ShopService;
import com.anybuy.service.SortService;
import com.anybuy.service.UserService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * @author kangyonggan
 * @since 16/9/17
 */
@Service
@Transactional
public class GoodsServiceImpl extends BaseService<Goods> implements GoodsService {

    @Autowired
    private UserService userService;

    @Autowired
    private ShopService shopService;

    @Autowired
    private SortService sortService;

    @Override
    public List<Goods> searchGoods(int pageNum, Integer pageSize, String goodsName, String sortCode) {
        Example example = new Example(Goods.class);
        Example.Criteria criteria = example.createCriteria();

        ShiroUser user = userService.getShiroUser();
        Shop shop = shopService.getShopByUserId(user.getId());

        criteria.andEqualTo("shopId", shop.getId());

        if (!StringUtils.isEmpty(goodsName)) {
            criteria.andLike("goodsName", "%" + goodsName + "%");
        }

        if (!StringUtils.isEmpty(sortCode)) {
            criteria.andEqualTo("sortCode", sortCode);
        }
        example.setOrderByClause("id desc");

        PageHelper.startPage(pageNum, pageSize);
        return super.selectByExample(example);
    }

    @Override
    public void saveGoods(Goods goods) {
        ShiroUser user = userService.getShiroUser();
        Shop shop = shopService.getShopByUserId(user.getId());

        goods.setIsDeleted((byte) 0);
        goods.setCreatedTime(new Date());
        goods.setUpdatedTime(new Date());

        goods.setShopId(shop.getId());
        goods.setShopName(shop.getShopName());

        Sort sort = sortService.findSortByCode(goods.getSortCode());
        goods.setSortName(sort.getSortName());

        super.insertSelective(goods);
    }

    @Override
    public Goods getGoods(Long id) {
        Goods goods = new Goods();
        goods.setId(id);
        goods.setIsDeleted((byte) 0);

        return super.selectOne(goods);
    }

    @Override
    public void updateGoods(Goods goods) {
        goods.setUpdatedTime(new Date());

        super.updateByPrimaryKeySelective(goods);
    }
}
