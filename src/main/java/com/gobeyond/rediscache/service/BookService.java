package com.gobeyond.rediscache.service;

import com.gobeyond.rediscache.model.Book;

public interface BookService {
	Book addBook(Book book);

	Book updateBook(Book book);

	Book getBook(long id);

	String deleteBook(long id);
}
