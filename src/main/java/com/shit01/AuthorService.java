package com.shit01;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthorService {
	
	private AuthorRepository authorRepository;
	
	@Autowired
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;		
	}

	public Iterable<Author> list() {

		return authorRepository.findAll();
	}







}
	