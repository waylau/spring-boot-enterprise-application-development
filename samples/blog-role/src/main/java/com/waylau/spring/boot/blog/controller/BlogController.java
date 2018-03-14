package com.waylau.spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Blog 控制器.
 * 
 * @since 1.0.0 2017年5月28日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {
	
	@GetMapping
	public String listBlogs(@RequestParam(value="order",required=false,defaultValue="new") String order,
			@RequestParam(value="keyword",required=false,defaultValue="" ) String keyword){
		System.out.println("order:" +order + ";keyword:" +keyword );
		return "redirect:/index?order="+order+"&keyword="+keyword;
	}

}
