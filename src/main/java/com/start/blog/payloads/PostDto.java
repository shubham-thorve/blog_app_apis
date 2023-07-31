package com.start.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {
	private Integer postId;
	private String postTitle;
	private String postContent;
	private String imageName;
	private Date postAddedDate;
//	private Category category; //causing recursion
//	private User user;

	private CategoryDto category;
	private UserDto user;

	private Set<CommentDto> comments = new HashSet<>();
	
}
