package com.waylau.spring.boot.blog.service;

import java.util.Optional;

import com.waylau.spring.boot.blog.domain.Authority;

/**
 * Authority 服务接口.
 * 
 * @since 1.0.0 2017年5月30日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface AuthorityService {
	/**
	 * 根据ID查询 Authority
	 * @param id
	 * @return
	 */
	Optional<Authority> getAuthorityById(Long id);
}
