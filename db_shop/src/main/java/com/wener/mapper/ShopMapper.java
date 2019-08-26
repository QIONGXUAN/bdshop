package com.wener.mapper;

import com.wener.domain.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    List<Shop> findByShop(@Param("cid") String cid);
    List<Shop> findLikeShop(@Param("name") String lName);
}