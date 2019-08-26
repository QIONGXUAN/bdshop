package com.vip.bd.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Shop {
    private Integer shopId;

    private String shopName;

    private String subTitle;

    private BigDecimal originalPrice;

    private BigDecimal promotePrice;

    private Integer stock;

    private Integer cateId;

    private Date createDate;
}