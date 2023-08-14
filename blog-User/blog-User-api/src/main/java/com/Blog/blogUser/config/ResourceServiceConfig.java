package com.Blog.blogUser.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * @Author 张恒瑞
 * @Description TODO
 * @Date 2023/8/14 19:12
 * @Version 1.0
 */

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class ResourceServiceConfig extends ResourceServerConfigurerAdapter {

    public static   String  RESOURCE_KEY="blog";



    @Autowired
    TokenStore tokenStore;
    @Override
    public void configure(HttpSecurity http) throws Exception {
             http.csrf().disable()
                     .authorizeRequests()
                     .antMatchers("/users/**").authenticated()
                     .anyRequest()
                     .permitAll();
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        System.out.println("进来获取资源");
            resources.resourceId(RESOURCE_KEY)
                    .tokenStore(tokenStore)
                    .stateless(true);
    }

}
