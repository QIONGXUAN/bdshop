package com.wener.utils;

import com.wener.domain.entity.Banner;
import com.wener.domain.entity.Navigation;
import com.wener.domain.vo.CateGoryVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CateBean implements Serializable {
    /**
     *     轮播
     */
    List<Banner> banners;
    //导航
    List<Navigation> navigations;
    //分类
    List<CateGoryVo> cateGoryVos;
}
