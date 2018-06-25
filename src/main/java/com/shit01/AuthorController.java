package com.shit01;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/authors")
public class AuthorController {
	
	
	private AuthorService authorService;
	
	@Autowired
	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)	
	public Iterable<Author> listPosts() {
		
		
		
		
		
		return authorService.list();
	}
	

}
