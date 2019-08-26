package com.wener.service.Impl;

import com.wener.domain.entity.Banner;
import com.wener.domain.entity.Navigation;
import com.wener.domain.vo.CateGoryVo;
import com.wener.mapper.BannerMapper;
import com.wener.mapper.CategoryMapper;
import com.wener.mapper.NavigationMapper;
import com.wener.service.IndexService;
import com.wener.utils.CateBean;
import com.wener.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    BannerMapper bannerMapper;
    @Resource
    NavigationMapper navigationMapper;
    @Resource
    CategoryMapper categoryMapper;

    @Override
    public CateBean getHeader() {
        List<Banner> order = bannerMapper.findAll("order");
        List<Navigation> navigations = navigationMapper.findNavigations();
        List<CateGoryVo> all = categoryMapper.findAll();
        CateBean cateBean=new CateBean();
        cateBean.setBanners(order);
        cateBean.setNavigations(navigations);
        cateBean.setCateGoryVos(all);
        return cateBean;

    }

    @Override
    public List<CateGoryVo> getContent() {
        List<CateGoryVo> shops = categoryMapper.findShop();
        return shops;
    }

    public static void main(String[] args) {
        IndexService indexService=new IndexServiceImpl();
        System.out.println(indexService.getHeader());
    }
}
