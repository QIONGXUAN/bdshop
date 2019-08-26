package com.vip.bd.service.impl;

import com.vip.bd.mapper.ShopShopcarMapper;
import com.vip.bd.service.ShopcarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopcarServiceImpl implements ShopcarService {

    @Resource
    ShopShopcarMapper shopShopcarMapper;

    @Override
    public int insertShopcar(int shopId, int number, int uid) {
        return shopShopcarMapper.insert(shopId,number,uid);
    }
}
