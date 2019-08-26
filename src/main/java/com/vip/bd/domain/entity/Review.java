package com.vip.bd.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Review {
    private Integer reviewId;

    private String content;

    private Date createDate;

    private Integer shopId;

    private Integer uid;
}