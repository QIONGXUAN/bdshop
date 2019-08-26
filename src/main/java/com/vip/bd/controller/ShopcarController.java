package com.vip.bd.controller;

import com.vip.bd.service.ShopcarService;
import com.vip.bd.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v2")
public class ShopcarController {

    @Resource
    ShopcarService shopcarService;

    @RequestMapping("insert")
    public Result insertShopcar(int shopId, int number, int uid) {
        int i = shopcarService.insertShopcar(shopId, number, uid);
        if (i>0){
            return Result.success(i);
        }
        return Result.error();
    }

}
