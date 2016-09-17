package com.anybuy.service;

import com.anybuy.model.Shop;

/**
 * @author kangyonggan
 * @since 2016/09/17
 */
public interface ShopService {

    Shop getShopByUserId(Long userId);

}