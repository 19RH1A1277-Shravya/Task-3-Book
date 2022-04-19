package com.book.services;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.Book;
import com.book.dao.BookDao;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	public BookDao bookDao;
	
	@Transactional
    //@Override
	public void add(Book book) {
		bookDao.add(book);
	}
	@Transactional
		public void delete(Book book) {
			bookDao.delete(book);
		}
	@Transactional
			public void update(Book book) {
				bookDao.update(book);
	}
	@Transactional
	public List<Book> select() {
		 return bookDao.select();
}
	
}
