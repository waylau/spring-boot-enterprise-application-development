package com.waylau.spring.boot.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.waylau.spring.boot.blog.domain.User;

/**
 * User Repository 接口.
 * 
 * @since 1.0.0 2017年7月16日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
