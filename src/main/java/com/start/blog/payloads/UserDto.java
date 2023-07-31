package com.start.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.start.blog.entitites.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {

	private int id;
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 characters")
	private String name;
	@NotEmpty(message="Email is required")
	@Email(message = "Email address is not valid !")
	private String email;
	@NotEmpty
	@Size(min = 8, max = 16, message = "Password must be min of 8 chars and max of 16 chars !")
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "Password must contain at least one number, one uppercase letter and one unique character such as !#$%&? ")
	private String password;
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
	
	private Set<CommentDto> comments = new HashSet<>();
	
}
