package com.book.services;
import java.util.List;

import com.book.Book;




public interface BookService {
	
		void add(Book book);
		void update(Book book);
		void delete(Book book);
		List<Book> select();

}
