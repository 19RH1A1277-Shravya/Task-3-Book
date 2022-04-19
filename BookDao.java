package com.book.dao;


	import java.util.List;

	import org.springframework.stereotype.Repository;

	import com.book.Book;

	@Repository

	public interface BookDao {
	

		

		
			 void add(Book book);
			 void update(Book book);
			 void delete(Book book);
	         List<Book> select();
		}
