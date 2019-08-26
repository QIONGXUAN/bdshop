package com.wener.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Banner {
    private Integer bannerId;
    private String title;
    private String image;
    private String detailUrl;
    private Integer order;
    private Date createTime;
}
