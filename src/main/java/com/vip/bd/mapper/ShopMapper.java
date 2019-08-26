package com.vip.bd.mapper;

import com.vip.bd.domain.entity.Shop;
import com.vip.bd.domain.vo.ShopVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {

    List<Shop> findByKeyWord(@Param("kw") String kw);

    ShopVo findShopImg(@Param("shopId") int shopId);

    ShopVo findReview(@Param("shopId") int shopId);

    int shopCount(int cateId);

}