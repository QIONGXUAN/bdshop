package com.vip.bd.controller;

import com.vip.bd.domain.entity.PropertyValue;
import com.vip.bd.domain.entity.Shop;
import com.vip.bd.domain.vo.CateGoryVo;
import com.vip.bd.domain.vo.ShopVo;
import com.vip.bd.service.ShopService;
import com.vip.bd.utils.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class ShopController {

    @Resource
    ShopService shopService;


    /**
     * 分类下商品信息
     * 分页的框架  总记录数    最大页数
     * 前端界面  page  size
     * 数据库sql start  size
     * 换算的公式   (page-1)  * size
     * 特殊情况
     * 1> 当前端 page size 不传  默认是第一页  size是10'
     * page=   page!=0 ? page:1;
     * size =  size!=0 ? size:10;
     * 2> 最大页数
     *  查询所有的表记录  select count(*)
     *  总记录数 / size  取余 不为0  页码+1
     *
     */
    @RequestMapping("/list/{page}/{size}")
    public Result<List<CateGoryVo>> list(int cateId,
                            @PathVariable(required = false) int page,
                            @PathVariable(required = false) int size){
        List<CateGoryVo> cateGoryVos = shopService.getContentData(cateId, page, size);
        if (cateGoryVos != null) {
            return Result.success(cateGoryVos);
        }
        return Result.error();
    }

    @RequestMapping("/property")
    public Result<List<PropertyValue>> getProperty(int shopId){
        List<PropertyValue> propertyValues = shopService.getProperty(shopId);
        if (propertyValues != null) {
            return Result.success(propertyValues);
        }
        return Result.error();
    }

    @RequestMapping("/detail")
    public Result<ShopVo> shopDetail(int shopId){
        ShopVo shopVo = shopService.shopDetail(shopId);
        if (shopVo != null) {
            return Result.success(shopVo);
        }
        return Result.error();
    }


    @RequestMapping("/count")
    public int shopCount(int cateId){
        return shopService.shopCount(cateId);
    }
}
