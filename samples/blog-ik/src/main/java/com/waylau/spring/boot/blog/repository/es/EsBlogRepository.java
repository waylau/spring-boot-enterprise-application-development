package com.waylau.spring.boot.blog.repository.es;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.waylau.spring.boot.blog.domain.es.EsBlog;

/**
 * EsBlog Repository接口.
 * 
 * @since 1.0.0 2017年6月8日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String> {
	
    /**
     * 模糊查询(去重)
     * @param title
     * @param Summary
     * @param content
     * @param tags
     * @param pageable
     * @return
     */
    Page<EsBlog> findByTitleContainingOrSummaryContainingOrContentContainingOrTagsContaining(
    		String title,String summary,String content,String tags,Pageable pageable);

    /**
     * 根据 Blog 的id 查询 EsBlog
     * @param blogId
     * @return
     */
    EsBlog findByBlogId(Long blogId);
}
