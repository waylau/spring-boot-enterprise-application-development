package com.waylau.spring.boot.blog.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.waylau.spring.boot.blog.domain.User;

/**
 * 用户服务接口.
 * 
 * @since 1.0.0 2017年7月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface UserService {
	 /**
     * 新增、编辑、保存用户
     * @param user
     * @return
     */
    User saveOrUpateUser(User user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    User registerUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void removeUser(Long id);

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    Optional<User> getUserById(Long id);

    /**
     * 根据用户名进行分页模糊查询
     * @param name
     * @param pageable
     * @return
     */
    Page<User> listUsersByNameLike(String name, Pageable pageable);
}