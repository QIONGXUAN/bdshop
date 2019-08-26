package com.vip.bd.service.impl;

import com.vip.bd.domain.entity.PropertyValue;
import com.vip.bd.domain.entity.Shop;
import com.vip.bd.domain.vo.CateGoryVo;
import com.vip.bd.domain.vo.ShopVo;
import com.vip.bd.mapper.CategoryMapper;
import com.vip.bd.mapper.PropertyValueMapper;
import com.vip.bd.mapper.ShopMapper;
import com.vip.bd.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    CategoryMapper categoryMapper;

    @Resource
    PropertyValueMapper propertyValueMapper;

    @Resource
    ShopMapper shopMapper;

    @Override
    public List<CateGoryVo> getContentData(int cateId, int page, int size) {
        page = page != 0 ? page : 1;
        size = size != 0 ? size : 10;
        page = (page - 1) * size;
        return categoryMapper.findByCateId(cateId, page, size);
    }

    @Override
    public List<PropertyValue> getProperty(int shopId) {
        return propertyValueMapper.findByShopId(shopId);
    }

    @Override
    public ShopVo shopDetail(int shopId) {
        ShopVo shopImg = shopMapper.findShopImg(shopId);
        ShopVo review = shopMapper.findReview(shopId);
        shopImg.setReviews(review.getReviews());
        return shopImg;
    }

    @Override
    public int shopCount(int cateId) {
        return shopMapper.shopCount(cateId);
    }
}
