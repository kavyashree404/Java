package OOps;
import java.util.*;
class Book{
	int bookId;
	String title;
	String author;
	double price;
	
	//parameterized constructor

	Book(int bookId,String title,	String author,double price){
		this.bookId=bookId; //variable=parameter 
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void displayDetails() {
		System.out.println("BookId:"+bookId);
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price: "+price);
	
	}
}

public class Libraryms {
public static void main(String[] args) {
	Book b1=new Book(1505,"Stranger Things","Duffer Brothers",2000);
	b1.displayDetails();
}
}
