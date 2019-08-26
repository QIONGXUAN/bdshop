package com.vip.bd.mapper;

import com.vip.bd.domain.vo.CateGoryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {

    List<CateGoryVo> findByCateId(@Param("cateId") int cateId,
                                  @Param("page") int page,
                                  @Param("size") int size);

    List<CateGoryVo> findAll();
}