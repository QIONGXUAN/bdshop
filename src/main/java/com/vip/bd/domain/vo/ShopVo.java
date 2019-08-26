package com.vip.bd.domain.vo;

import com.vip.bd.domain.entity.Review;
import com.vip.bd.domain.entity.Shop;
import com.vip.bd.domain.entity.ShopImage;
import lombok.Data;

import java.util.List;

@Data
public class ShopVo extends Shop {
    ShopImage shopImage;
    List<ShopImage> shopImages;
    List<Review> reviews;
}
