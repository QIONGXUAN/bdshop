package com.wener.controller;

import com.wener.domain.vo.CateGoryVo;
import com.wener.service.IndexService;
import com.wener.utils.CateBean;
import com.wener.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * /api/v2/heads
 */
@RestController
@RequestMapping("/api/v2")
public class IndexController {
    @Resource
    IndexService indexService;

    /**
     * 导航  菜单  轮播
     *
     * @return
     */
    @GetMapping("/heads")
    public Result getHeaderData() {
        try {
            CateBean cateBean = indexService.getHeader();
            return Result.success(cateBean);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 分类下商品信息
     *
     * @return
     */
    public Result getContentData() {
        try {
            List<CateGoryVo> content = indexService.getContent();
            return Result.success(content);
        }catch (Exception e){
            return Result.error();
        }
    }


    public static void main(String[] args) {
        IndexController indexController=new IndexController();
        System.out.println(indexController.getContentData());
    }
}
