package com.vip.bd.domain.entity;

import lombok.Data;

@Data
public class PropertyValue {
    private Integer proValueId;

    private Integer propertyId;

    private Integer shopId;

    private String value;
}