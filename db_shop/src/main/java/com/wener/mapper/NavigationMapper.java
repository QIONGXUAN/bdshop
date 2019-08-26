package com.wener.mapper;


import com.wener.domain.entity.Navigation;

import java.util.List;

/**
 * '导航操作
 */
public interface NavigationMapper {
    List<Navigation> findNavigations();
}