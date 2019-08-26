package com.vip.bd.mapper;

import com.vip.bd.domain.entity.SubMenu1;

public interface SubMenu1Mapper {
    int deleteByPrimaryKey(Integer subMenu2Id);

    int insert(SubMenu1 record);

    int insertSelective(SubMenu1 record);

    SubMenu1 selectByPrimaryKey(Integer subMenu2Id);

    int updateByPrimaryKeySelective(SubMenu1 record);

    int updateByPrimaryKey(SubMenu1 record);
}