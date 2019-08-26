package com.wener.mapper;

import com.wener.domain.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BannerMapper {
    List<Banner> findAll(@Param("ord") String ord);
}
