package com.waylau.spring.boot.blog.domain.es;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


/**
 * Blog 文档.
 * 
 * @since 1.0.0 2017年5月2日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Document(indexName = "blog", type = "blog") // 文档
public class EsBlog implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id // 主键
	private String id; 
	private String title;
	private String summary;
	private String content;
	
	protected EsBlog() { // JPA 的规范要求无参构造函数；设为 protected 防止直接使用 
	}
	
	public EsBlog(String title, String summary, String content) { 
		this.title = title;
		this.summary = summary;
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return String.format(
				"EsBlog[id='%s',title='%s',summary='%s',content='%s']", 
				id, title, summary, content);
	}
}
