package com.anybuy.controller.dashboard;

import com.anybuy.constant.AppConstant;
import com.anybuy.model.Goods;
import com.anybuy.service.GoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 商铺管理自己的商品
 *
 * @author kangyonggan
 * @since 16/9/15
 */
@Controller
@RequestMapping("dashboard")
public class DashboardIndexController {

    private static final String PATH_ROOT = "dashboard/index/";
    private static final String PATH_INDEX = PATH_ROOT + "index";

    @Autowired
    private GoodsService goodsService;

    /**
     * 商品列表
     *
     * @param pageNum
     * @param goodsName
     * @param sortCode
     * @param model
     * @return
     * @throws Exception
     */
    public String index(@RequestParam(value = "p", required = false, defaultValue = "1") int pageNum,
                        @RequestParam(value = "goodsName", required = false, defaultValue = "") String goodsName,
                        @RequestParam(value = "sortCode", required = false, defaultValue = "") String sortCode,
                        Model model) throws Exception {
        List<Goods> goodses = goodsService.searchGoods(pageNum, AppConstant.PAGE_SIZE, goodsName, sortCode);
        PageInfo<Goods> page = new PageInfo(goodses);

        model.addAttribute("page", page);
        return PATH_INDEX;
    }

}
