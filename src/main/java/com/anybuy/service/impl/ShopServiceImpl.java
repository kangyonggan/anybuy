package com.anybuy.service.impl;

import com.anybuy.model.Shop;
import com.anybuy.service.ShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kangyonggan
 * @since 16/9/17
 */
@Service
@Transactional
public class ShopServiceImpl extends BaseService<Shop> implements ShopService {

    @Override
    public Shop getShopByUserId(Long userId) {
        Shop shop = new Shop();
        shop.setUserId(userId);
        shop.setIsDeleted((byte) 0);

        return super.selectOne(shop);
    }
}
