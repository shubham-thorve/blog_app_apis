package com.start.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.start.blog.entitites.Comments;
import com.start.blog.entitites.Post;
import com.start.blog.entitites.User;
import com.start.blog.exceptions.ResourceNotFoundException;
import com.start.blog.payloads.CommentDto;
import com.start.blog.repositories.CommentRepo;
import com.start.blog.repositories.PostRepo;
import com.start.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "post id", postId));
		Comments comment = this.modelMapper.map(commentDto, Comments.class);
		User user = post.getUser();
		comment.setPost(post);
		comment.setUser(user);
		
		Comments savedComment = this.commentRepo.save(comment);
		
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		// TODO Auto-generated method stub
		Comments comment = this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment","commentId",commentId));
		this.commentRepo.delete(comment);
	}

}
