package com.vip.bd.domain.vo;

import com.vip.bd.domain.entity.Property;
import com.vip.bd.domain.entity.PropertyValue;
import lombok.Data;

import java.util.List;

@Data
public class PropertyValueVo extends PropertyValue {
    List<Property> propertyList;
}
