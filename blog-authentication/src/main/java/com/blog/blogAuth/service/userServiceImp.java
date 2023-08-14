package com.blog.blogAuth.service;


import com.alibaba.fastjson.JSON;
import com.blog.blogAuth.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author 张恒瑞
 * @Description TODO
 * @Date 2023/8/13 18:55
 * @Version 1.0
 */

@Service("userServiceImp")
public class userServiceImp implements UserDetailsService {

    @Autowired
    PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        user user = new user();
        user.setUserid(1);
        user.setUsername("1822zhang");
        user.setPassword("1822zhang");


        String jsonString = JSON.toJSONString(user);

        return User.withUsername(jsonString).password(passwordEncoder.encode(user.getPassword())).authorities("admin")
                .build();


    }
}
