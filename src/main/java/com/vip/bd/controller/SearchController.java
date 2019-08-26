package com.vip.bd.controller;

import com.vip.bd.domain.entity.Shop;
import com.vip.bd.service.SearchService;
import com.vip.bd.utils.CateBean;
import com.vip.bd.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 搜索功能
 *
 * 主键、普通、唯一、全文索引
 *
 * like 列名 like '%key%'
 *
 * 跨列
 * 跨表 -- es 搜索服务器
 *
 * 1. 首页的商品信息 ---->展示   DOM操作
 * 2. 详情界面 --- >  显示商品信息  添加购物车 --> 发送ajax请求 add
 * 3. 搜索分页查询   limit
 *
 */
@RestController
@RequestMapping("/api/v2")
public class SearchController {

    @Resource
    SearchService searchService;
    @GetMapping("/search")
    public Result<List<Shop>> search(String  keyword){
        try {
            List<Shop> shops = searchService.search(keyword);
            if (shops != null) {
                return Result.success(shops);
            }
            return Result.error();
        } catch (Exception e){
            return Result.error();
        }
    }






}
