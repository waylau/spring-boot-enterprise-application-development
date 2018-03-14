package com.waylau.spring.boot.blog.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.waylau.spring.boot.blog.domain.User;

/**
 * User Repository 接口.
 * 
 * @since 1.0.0 2017年7月16日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface UserRepository extends JpaRepository<User, Long>{
	
	/**
	 * 根据用户姓名分页查询用户列表
	 * @param name
	 * @param pageable
	 * @return
	 */
	Page<User> findByNameLike(String name, Pageable pageable);
	
	/**
	 * 根据用户账号查询用户
	 * @param username
	 * @return
	 */
	User findByUsername(String username);

	/**
	 * 根据名称列表查询用户列表
	 * @param usernames
	 * @return
	 */
	List<User> findByUsernameIn(Collection<String> usernames);
}