package com.book;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Airlines")
@Entity
public class Book {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int book_id;
	@Column(name="book_name")
      private String book_name;
	@Column(name="cost")
	 private int cost;
	@Column(name="author")
	 private String author;
	@Column(name="publisher")
	private String publisher;
	public Book(int book_id, String book_name, int cost, String author, String publisher) {
		// TODO Auto-generated constructor stub
		this.book_id = book_id;
        this.book_name = book_name;
        this.cost = cost;
        this.author = author;
        this.publisher = publisher;
	}
	public Book(int book_id) {
		this.book_id = book_id;
		
	}
   
	
	public Book() {
		
	}



	public int getBook_id() {
		return book_id;
	}



	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}



	public String getBook_name() {
		return book_name;
	}



	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
		
	
	
	

}
