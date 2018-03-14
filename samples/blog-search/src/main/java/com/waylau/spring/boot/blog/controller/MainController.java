package com.waylau.spring.boot.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.waylau.spring.boot.blog.domain.Authority;
import com.waylau.spring.boot.blog.domain.User;
import com.waylau.spring.boot.blog.service.AuthorityService;
import com.waylau.spring.boot.blog.service.UserService;

/**
 * 主页控制器.
 * 
 * @since 1.0.0 2017年7月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Controller
public class MainController {

	private static final Long ROLE_USER_AUTHORITY_ID = 2L; // 用户权限（博主）

	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthorityService  authorityService;
	
	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String index() {
		return "redirect:/blogs";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		model.addAttribute("errorMsg", "登录失败，用户名或者密码错误！");
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}

	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
    @PostMapping("/register")
    public String registerUser(User user) {
		List<Authority> authorities = new ArrayList<>();
		authorities.add(authorityService.getAuthorityById(ROLE_USER_AUTHORITY_ID).get());
		user.setAuthorities(authorities);
        userService.registerUser(user);
        return "redirect:/login";
    }
	
}
