package com.wener.domain.vo;

import com.wener.domain.entity.Category;
import com.wener.domain.entity.Shop;
import com.wener.domain.entity.SubMenu;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
public class CateGoryVo extends Category {

    List< SubMenu> subMenuList;

     List<Shop> shops;
}
