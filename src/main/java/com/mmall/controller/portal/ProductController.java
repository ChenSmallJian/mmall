package com.mmall.controller.portal;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.IProductService;
import com.mmall.vo.ProductDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by chenjian
 */
@Controller
@RequestMapping("/product/")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    /**
     * 前端用户查询商品详细信息
     * @param productId
     * @return
     */
    @RequestMapping("product_detail.do")
    @ResponseBody
    public ServerResponse<ProductDetailVo> productDetail(Integer productId){
        return iProductService.productDetail(productId);
    }

    /**
     * 用户端的商品搜索
     * @param keyword
     * @param categoryId
     * @param pageNum
     * @param pageSize
     * @param orderBy
     * @return
     */
    @RequestMapping("product_search.do")
    @ResponseBody
    public ServerResponse<PageInfo> productSearch(@RequestParam(value="keyword",required = false) String keyword,
                                                  @RequestParam(value="categoryId",required = false) Integer categoryId,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                  @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                  @RequestParam(value = "orderBy", defaultValue = "")String orderBy){
        return iProductService.productSearch(keyword,categoryId,pageNum,pageSize,orderBy);
    }
}