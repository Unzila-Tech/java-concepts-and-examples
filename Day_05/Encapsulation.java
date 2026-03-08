package week5or6;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bookId;String title,author,genre;boolean available;
		System.out.println("enter bookId");
	    bookId=sc.nextInt();
	    sc.nextLine();
	    System.out.println("enter title");
	    title=sc.nextLine();
	    System.out.println("enter author");
	    author=sc.nextLine();
	    System.out.println("enter genre");
	    genre=sc.nextLine();
	    System.out.println("enter availability");
	    available=sc.nextBoolean();
	    System.out.println("enter userId");
		int userid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
	    book b1=new book(bookId,title,author,genre,available);
	    //can not access private attribute directly
	    //.book_id;
	    System.out.println("Book Id " + b1.getBook_id());
	    user u1=new user(userid,name);
	  //can not access private attribute directly
	    //u1.userId;
	    System.out.println("User Id " + u1.getUserId());

	}

}
