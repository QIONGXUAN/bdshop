package com.vip.bd.service.impl;

import com.vip.bd.domain.entity.Shop;
import com.vip.bd.mapper.ShopMapper;
import com.vip.bd.service.SearchService;
import com.vip.bd.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Resource
    ShopMapper shopMapper;

    @Override
    public List<Shop> search(String kw) {
        List<Shop> shops = shopMapper.findByKeyWord(kw);
        return shops;
    }
}
