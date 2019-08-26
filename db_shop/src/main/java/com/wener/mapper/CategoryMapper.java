package com.wener.mapper;




import com.wener.domain.vo.CateGoryVo;

import java.util.List;

public interface CategoryMapper {
    List<CateGoryVo> findAll();
    List<CateGoryVo> findShop();
}