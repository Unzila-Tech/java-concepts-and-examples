package week5or6;

import java.util.Scanner;

class FictionBook extends book {
 private String type = "Fiction";

 public FictionBook(int bookID, String title, String author, String genre, boolean available) {
     super(bookID, title, author, genre, available);
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Type: " + type);
 }
}
class NonFictionBook extends book {
 private String type = "Non-Fiction";

 public NonFictionBook(int bookID, String title, String author, String genre, boolean available) {
     super(bookID, title, author, genre, available);
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Type: " + type);
 }
}
public class TestPolymorphism {
 public static void main(String[] args) {
	 int bookId;String title,author,genre;boolean available;
 	Scanner sc=new Scanner(System.in);
 	System.out.println("enter bookId");
	    bookId=sc.nextInt();
	    sc.nextLine();
	    System.out.println("enter title");
	    title=sc.nextLine();
	    System.out.println("enter author");
	    author=sc.nextLine();
	    System.out.println("enter genre");
	    genre=sc.nextLine();
	    System.out.println("enter availability(true or false)");
	    available=sc.nextBoolean();
     book fiction = new FictionBook(bookId,title,author,genre,available);
     fiction.displayDetails();
     System.out.println();
  
     System.out.println("enter bookId");
	    bookId=sc.nextInt();
	    sc.nextLine();
	    System.out.println("enter title");
	    title=sc.nextLine();
	    System.out.println("enter author");
	    author=sc.nextLine();
	    System.out.println("enter genre");
	    genre=sc.nextLine();
	    System.out.println("enter availability(true or false)");
	    available=sc.nextBoolean();
     book nonFiction = new NonFictionBook(bookId,title,author,genre,available);
     nonFiction.displayDetails();
 }
}