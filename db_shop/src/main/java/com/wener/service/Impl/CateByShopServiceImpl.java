package com.wener.service.Impl;

import com.wener.domain.entity.Shop;
import com.wener.mapper.ShopMapper;
import com.wener.service.CateByShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CateByShopServiceImpl implements CateByShopService {
    @Resource
    ShopMapper shopMapper;

    @Override
    public List<Shop> shopByCid(String cid) {
        List<Shop> shops = shopMapper.findByShop(cid);
        return shops;
    }

    @Override
    public List<Shop> findLikeShop(String lName) {
        List<Shop> likeShop = shopMapper.findLikeShop(lName);
        if(lName==null){
            return null;
        }else {
            return likeShop;
        }
    }
}
