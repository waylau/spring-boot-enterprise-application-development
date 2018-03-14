package com.waylau.spring.boot.blog.vo;

/**
 * 后台管理的菜单.
 * 
 * @since 1.0.0 2017年5月29日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class Menu {

    private String name; // 菜单名称
    private String url; // 菜单 URL
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
}
