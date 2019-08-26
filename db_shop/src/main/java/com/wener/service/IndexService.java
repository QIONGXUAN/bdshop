package com.wener.service;

import com.wener.domain.vo.CateGoryVo;
import com.wener.utils.CateBean;

import java.util.List;

public interface IndexService {
    CateBean getHeader();
    //分类下商品信息
    List<CateGoryVo> getContent();
}
