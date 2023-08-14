package com.Blog.blogUser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张恒瑞
 * @Description TODO
 * @Date 2023/8/14 19:29
 * @Version 1.0
 */

@RestController
@RequestMapping("/users")
public class userController {
    @GetMapping("/getuser")
    public   String getuser(){
        return  "getuser";
    }
}
