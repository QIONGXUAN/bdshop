package com.wener.service;

import com.wener.domain.entity.Shop;

import java.util.List;

public interface CateByShopService {
    //点击显示商品功能
    List<Shop> shopByCid(String cid);
    //搜索功能
    List<Shop> findLikeShop(String lName);

}
