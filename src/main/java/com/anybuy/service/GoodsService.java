package com.anybuy.service;

import com.anybuy.model.Goods;

import java.util.List;

/**
 * @author kangyonggan
 * @since 2016/09/17
 */
public interface GoodsService {


    List<Goods> searchGoods(int pageNum, Integer pageSize, String goodsName, String sortCode);

}