/**
 * 
 */
package com.waylau.spring.boot.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waylau.spring.boot.blog.domain.Authority;
import com.waylau.spring.boot.blog.repository.AuthorityRepository;


/**
 * Authority 服务接口的实现.
 * 
 * @since 1.0.0 2017年5月30日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepository authorityRepository;

	@Override
	public Optional<Authority> getAuthorityById(Long id) {
		return authorityRepository.findById(id);
	}

}
