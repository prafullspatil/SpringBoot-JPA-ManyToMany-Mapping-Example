package com.mb.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mb.jpa.entity.Book;
import com.mb.jpa.repository.BookRepository;
import com.mb.jpa.service.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController
{

	@Autowired
	private BookService bookService;

	@Autowired
	private BookRepository bookRepository;

	@PostMapping
	public List<Book> saveBook(@RequestBody List<Book> bookList)
	{
		List<Book> bookResponse = (List<Book>) bookService.saveBook(bookList);
		return bookResponse;
	}

	@GetMapping
	public List<Book> getBookDetails()
	{
		List<Book> bookResponse = (List<Book>) bookRepository.findAll();

		return bookResponse;
	}
}
