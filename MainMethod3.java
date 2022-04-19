package com.book;
import com.book.config.BookConfig;
import com.book.services.BookService;



import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod3 {
public static void main(String[] args) throws InterruptedException, SQLException
	
	{
        System.out.println("This is the start of the PT Spring Hibernate application");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BookConfig.class);

        BookService bookService = context.getBean(BookService.class);
        Scanner sc=new Scanner(System.in);
       
        int a,k,f,c;
        String b,d,e;
        
       do {
        	System.out.println("1.insert .delete 3.update 4.select 5.exit");
        	k=sc.nextInt();
        switch(k) {
        
        case 1:System.out.println("Enter the book_id to insert");
        a=sc.nextInt();
        System.out.println("insert book_name");
        b=sc.next();
        System.out.println("insert cost");
        c=sc.nextInt();
        System.out.println("insert author");
        d=sc.next();
        System.out.println("insert publisher");
        e=sc.next();
        Book a1=new Book(a,b,c,d,e);
        bookService.add(a1);
         break;
         
        case 2:System.out.println("Enter the book_id to delete");
                 f=sc.nextInt();
           Book a2=new Book(f);
           a2.setBook_id(f);
           bookService.delete(a2);
           break;
       
       
      case 3:System.out.println("Enter the book_id to  update");
            a=sc.nextInt();
            System.out.println("update book_name");
            b=sc.next();
            System.out.println("update cost");
            c=sc.nextInt();
            System.out.println("update author");
            d=sc.next();
            System.out.println(" update publisher");
            e=sc.next();
            Book x= new Book(a,b, c, d,e);
            bookService.update(x);
            break;
      case 4:System.out.println("Select book_id to display the details");
      
		List<Book> a9=bookService.select();
		for(Book i:a9) {
			System.out.println(i.getBook_id()+" "+i.getBook_name()+" "+" "+i.getCost()+i.getAuthor()+" "+i.getPublisher());
		}
		break;
        
        
            
       default : System.out.println("no such book_id exists");
    	   
    	   java.lang.System.exit(0);
	        break;
	        
        }

        }while(true);
        
	}
	
	

}
