package com.mb.jpa.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.mb.jpa.entity.Book;

@Component
public interface BookService
{

	public List<Book> saveBook(List<Book> bookList);
}
