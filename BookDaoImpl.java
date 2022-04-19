package com.book.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.book.Book;
@Repository
public class BookDaoImpl implements BookDao{
	
	
		 @Autowired
		    private SessionFactory sessionFactory;

		   // @Override
		    public void add(Book book) {
		        sessionFactory.getCurrentSession().save(book);
		    }
		        public void delete(Book book) {
			        sessionFactory.getCurrentSession().delete(book);
		        }
			        public void update(Book book) {
				        sessionFactory.getCurrentSession().update(book);
		    }
			        @SuppressWarnings("unchecked")
			    	public List<Book> select(){
			    		
			    		List<Book> memberlist = (List<Book>) sessionFactory.getCurrentSession()
			                    .createCriteria(Book.class)
			                    .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			            return memberlist;
			        
			        }
	}
	
