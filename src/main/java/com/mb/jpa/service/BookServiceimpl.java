package com.mb.jpa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.jpa.entity.Book;
import com.mb.jpa.entity.Story;
import com.mb.jpa.repository.BookRepository;

@Service("bookServiceImpl")
public class BookServiceimpl implements BookService
{

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> saveBook(List<Book> bookList)
	{
		// Use two books which we are passing from postman
		Book book1 = bookList.get(0);
		Book book2 = bookList.get(1);

		// create stories
		Story story1 = new Story();
		Story story2 = new Story();
		story1.setStoryName("Salman khan");
		story2.setStoryName("Sharukh khan");

		// populate storySet
		book1.getStorySet().add(story1);
		book1.getStorySet().add(story2);
		book2.getStorySet().add(story1);
		book2.getStorySet().add(story2);

		// populate bookSet
		story1.getBookSet().add(book1);
		story1.getBookSet().add(book2);
		story2.getBookSet().add(book1);
		story2.getBookSet().add(book2);

		// Save owner entities
		List<Book> bookResponse = (List<Book>) bookRepository.saveAll(bookList);

		return bookResponse;
	}

	public Book findByBookId(int bookId)
	{
		Optional<Book> bookResponse = bookRepository.findById(bookId);
		Book book = bookResponse.get();
		return book;
	}

}
