package com.vip.bd.mapper;

import org.apache.ibatis.annotations.Param;

public interface ShopShopcarMapper {

    int insert(@Param("shopId") int shopId,
               @Param("number") int number,
               @Param("uid") int uid);

}