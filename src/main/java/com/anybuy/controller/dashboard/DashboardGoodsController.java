package com.anybuy.controller.dashboard;

import com.anybuy.constant.AppConstant;
import com.anybuy.model.Goods;
import com.anybuy.model.Sort;
import com.anybuy.service.GoodsService;
import com.anybuy.service.SortService;
import com.anybuy.util.FileUpload;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

/**
 * 商铺管理自己的商品
 *
 * @author kangyonggan
 * @since 16/9/15
 */
@Controller
@RequestMapping("dashboard/goods")
public class DashboardGoodsController {

    private static final String PATH_ROOT = "dashboard/index/";
    private static final String PATH_INDEX = PATH_ROOT + "index";
    private static final String PATH_FORM = PATH_ROOT + "form";

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private SortService sortsService;

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
    @RequestMapping(method = RequestMethod.GET)
    public String index(@RequestParam(value = "p", required = false, defaultValue = "1") int pageNum,
                        @RequestParam(value = "goodsName", required = false, defaultValue = "") String goodsName,
                        @RequestParam(value = "sortCode", required = false, defaultValue = "") String sortCode,
                        Model model) throws Exception {
        List<Goods> goodses = goodsService.searchGoods(pageNum, AppConstant.PAGE_SIZE, goodsName, sortCode);
        PageInfo<Goods> page = new PageInfo(goodses);
        List<Sort> sorts = sortsService.findSorts();

        model.addAttribute("page", page);
        model.addAttribute("sorts", sorts);
        return PATH_INDEX;
    }

    /**
     * 添加商品
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String create(Model model) {
        List<Sort> sorts = sortsService.findSorts();

        model.addAttribute("goods", new Goods());
        model.addAttribute("sorts", sorts);
        return PATH_FORM;
    }

    /**
     * 保存商品
     *
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@RequestParam(value = "picture", required = false) MultipartFile picture, @ModelAttribute("goods") @Valid Goods goods, BindingResult result) throws Exception {

        String path = FileUpload.upload(picture);
        goods.setPicture(path);

        goodsService.saveGoods(goods);

        return "redirect:/dashboard/goods";
    }

    /**
     * 编辑商品
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "{id:\\d+}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable("id") Long id, Model model) {
        Goods goods = goodsService.getGoods(id);
        List<Sort> sorts = sortsService.findSorts();

        model.addAttribute("goods", goods);
        model.addAttribute("sorts", sorts);
        return PATH_FORM;
    }

    /**
     * 更新商品
     *
     * @return
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute("goods") @Valid Goods goods, BindingResult result) {

        if (!result.hasErrors()) {
            goodsService.updateGoods(goods);
        }

        return "redirect:/dashboard/goods";
    }

}
