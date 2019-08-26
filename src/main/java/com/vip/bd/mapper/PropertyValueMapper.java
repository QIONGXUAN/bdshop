package com.vip.bd.mapper;


import com.vip.bd.domain.entity.PropertyValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyValueMapper {
    List<PropertyValue> findByShopId(@Param("shopId") int shopId);
}