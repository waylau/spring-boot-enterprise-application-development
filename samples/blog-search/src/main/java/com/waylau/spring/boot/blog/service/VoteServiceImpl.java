package com.waylau.spring.boot.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waylau.spring.boot.blog.domain.Vote;
import com.waylau.spring.boot.blog.repository.VoteRepository;

/**
 * Vote 服务实现.
 * @since 1.0.0 2017年6月6日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;
    
	@Override
	public Optional<Vote> getVoteById(Long id) {
		return voteRepository.findById(id);
	}
	
	@Override
	public void removeVote(Long id) {
		voteRepository.deleteById(id);
	}
}
