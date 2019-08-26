package com.wener.controller;

import com.wener.domain.entity.Shop;
import com.wener.service.CateByShopService;
import com.wener.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shops")
public class CateByShopController {
    @Resource
    CateByShopService cateByShopService;

    Result result=new Result();

    @RequestMapping("/shop")
    public Result CateByShopAll(String cid){
        List<Shop> shops = cateByShopService.shopByCid(cid);
        result.setStatus(200);
        result.setData(shops);
        result.setMsg("success");
        return result;
    }


    @RequestMapping("/search")
    public Result findLikeShop(String name){
        List<Shop> shops = cateByShopService.findLikeShop(name);
        result.setStatus(200);
        result.setData(shops);
        result.setMsg("success");
        return result;
    }

    @RequestMapping("/list/{page}/{size}")
    public Result shopPage(int page , int size){

    }


    public static void main(String[] args) {
        CateByShopController cateByShopController=new CateByShopController();
        Result result = cateByShopController.CateByShopAll("83");
        System.out.println(result);
        System.out.println(cateByShopController.findLikeShop("电视"));
    }
}
