package com.Blog.blogSystem.service.imp.imp;

import com.Blog.blogSystem.service.systemService;
import org.springframework.stereotype.Service;

/**
 * @Author 张恒瑞
 * @Description TODO
 * @Date 2023/8/11 20:26
 * @Version 1.0
 */
@Service
public class systemServiceIpm  implements systemService {


    @Override
    public String test() {
        return "test";
    }
}
