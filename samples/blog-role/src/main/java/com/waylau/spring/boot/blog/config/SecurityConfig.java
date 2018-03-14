package com.waylau.spring.boot.blog.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全配置类.
 * 
 * @since 1.0.0 2017年5月30日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	/**
     * 自定义配置
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/css/**", "/js/**", "/fonts/**", "/index").permitAll(); // 都可以访问
    }
}
