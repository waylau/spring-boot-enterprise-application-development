package com.waylau.spring.boot.blog.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.waylau.spring.boot.blog.domain.User;
import com.waylau.spring.boot.blog.repository.UserRepository;

/**
 * 用户服务接口实现.
 *
 * @since 1.0.0 2017年7月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	@Override
	public User saveOrUpateUser(User user) {
		return userRepository.save(user);
	}

	@Transactional
	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}

	@Transactional
	@Override
	public void removeUser(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public Optional<User> getUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public Page<User> listUsersByNameLike(String name, Pageable pageable) {
		
        // 模糊查询
        name = "%" + name + "%";
        Page<User> users = userRepository.findByNameLike(name, pageable);
        return users;
	}

}
