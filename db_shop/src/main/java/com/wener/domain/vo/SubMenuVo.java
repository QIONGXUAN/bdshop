package com.wener.domain.vo;

import com.wener.domain.entity.SubMenu;
import com.wener.domain.entity.SubMenu1;
import lombok.Data;

import java.util.List;

@Data
public class SubMenuVo extends SubMenu {
    List<SubMenu1> subMenu1List;
}
