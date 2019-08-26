package com.vip.bd.service.impl;


import com.vip.bd.domain.entity.Banner;
import com.vip.bd.domain.entity.Navigation;
import com.vip.bd.domain.vo.CateGoryVo;
import com.vip.bd.mapper.BannerMapper;
import com.vip.bd.mapper.CategoryMapper;
import com.vip.bd.mapper.NavigationMapper;
import com.vip.bd.service.IndexService;
import com.vip.bd.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    BannerMapper bannerMapper;
    @Resource
    CategoryMapper categoryMapper;
    @Resource
    NavigationMapper navigationMapper;

    @Override
    public CateBean getHeader() {
        CateBean cateBean = new CateBean();
        List<Banner> bannerList = bannerMapper.findAll("title");
        List<CateGoryVo> cateGoryVoList = categoryMapper.findAll();
        List<Navigation> navigationList = navigationMapper.findNavigations();
        cateBean.setBanners(bannerList);
        cateBean.setCateGoryVos(cateGoryVoList);
        cateBean.setNavigations(navigationList);
        return cateBean;
    }


}
