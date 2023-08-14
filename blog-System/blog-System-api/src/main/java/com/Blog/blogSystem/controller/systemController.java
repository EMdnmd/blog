package com.Blog.blogSystem.controller;

import com.Blog.blogSystem.service.systemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张恒瑞
 * @Description TODO
 * @Date 2023/8/11 20:27
 * @Version 1.0
 */
@RestController
public class systemController {
    @Autowired
    private systemService systemService;

    @GetMapping("/test")
    public String test() {
        return systemService.test();
    }
}
