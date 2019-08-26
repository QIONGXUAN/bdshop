package com.vip.bd.controller;

import com.vip.bd.service.IndexService;
import com.vip.bd.utils.CateBean;
import com.vip.bd.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v2")
public class IndexController {

    @Resource
    IndexService indexService;

    /**
     * 导航  菜单  轮播
     * @return
     */
    @GetMapping("/heads")
    public Result getHeaderData(){
        CateBean header = indexService.getHeader();
        if (header != null) {
            return Result.success(header);
        }
        return Result.error();
    }


}
