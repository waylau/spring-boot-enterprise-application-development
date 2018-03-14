package com.waylau.spring.boot.blog.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.waylau.spring.boot.blog.domain.Blog;
import com.waylau.spring.boot.blog.domain.Comment;
import com.waylau.spring.boot.blog.domain.User;
import com.waylau.spring.boot.blog.repository.BlogRepository;

/**
 * Blog 服务.
 * 
 * @since 1.0.0 2017年4月7日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;

	@Transactional
	@Override
	public Blog saveBlog(Blog blog) {
		Blog returnBlog = blogRepository.save(blog);
		return returnBlog;
	}

	@Transactional
	@Override
	public void removeBlog(Long id) {
		blogRepository.deleteById(id);
	}

	@Override
	public Optional<Blog> getBlogById(Long id) {
		return blogRepository.findById(id);
	}

	@Override
	public Page<Blog> listBlogsByTitleVote(User user, String title, Pageable pageable) {
		// 模糊查询
		title = "%" + title + "%";
		String tags = title;
		Page<Blog> blogs = blogRepository.findByTitleLikeAndUserOrTagsLikeAndUserOrderByCreateTimeDesc(title, 
				user, tags, user, pageable);
		return blogs;
	}

	@Override
	public Page<Blog> listBlogsByTitleVoteAndSort(User user, String title, Pageable pageable) {
		// 模糊查询
		title = "%" + title + "%";
		Page<Blog> blogs = blogRepository.findByUserAndTitleLike(user, title, pageable);
		return blogs;
	}

	@Override
	public void readingIncrease(Long id) {
		Optional<Blog> blog = blogRepository.findById(id);
		Blog blogNew = null;

		if (blog.isPresent()) {
			blogNew = blog.get();
			blogNew.setReadSize(blogNew.getReadSize() + 1); // 在原有的阅读量基础上递增1
			this.saveBlog(blogNew);
		}
	}
	
	@Override
	public Blog createComment(Long blogId, String commentContent) {
		Optional<Blog> optionalBlog = blogRepository.findById(blogId);
		Blog originalBlog = null;
		if(optionalBlog.isPresent()) {
			originalBlog = optionalBlog.get();
			User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal(); 
			Comment comment = new Comment(user, commentContent);
			originalBlog.addComment(comment);
		}

		return this.saveBlog(originalBlog);
	}

	@Override
	public void removeComment(Long blogId, Long commentId) {
		Optional<Blog> optionalBlog = blogRepository.findById(blogId);
		if(optionalBlog.isPresent()) {
			Blog originalBlog = optionalBlog.get();
			originalBlog.removeComment(commentId);
			this.saveBlog(originalBlog);
		}
	}
}
