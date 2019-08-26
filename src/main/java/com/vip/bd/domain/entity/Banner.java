package com.vip.bd.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Banner {
    private Integer bannerId;

    private String title;

    private String image;

    private String detailUrl;

    private Integer order;

    private Date createTime;
}