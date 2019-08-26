package com.vip.bd.service;

import com.vip.bd.domain.entity.PropertyValue;
import com.vip.bd.domain.entity.Shop;
import com.vip.bd.domain.vo.CateGoryVo;
import com.vip.bd.domain.vo.ShopVo;

import java.util.List;

public interface ShopService {

    List<CateGoryVo> getContentData(int cate_id, int page, int size);

    List<PropertyValue> getProperty(int shopId);

    ShopVo shopDetail(int shopId);

    int shopCount(int cateId);

}
