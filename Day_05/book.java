package week5or6;
import java.util.Scanner;
public class book {
	private int book_id; 
	private String title;
	private String author;
	private String genre;
	boolean available;

	public book(int book_id, String title, String author, String genre, boolean available) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.available = available;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	/*public boolean isAvailable() {
		return available;
	}*/
	public void displayDetails() {
		System.out.println("Book Id:" + book_id + "\nTitle:" + title + "\nAuthor:" + author + "\nGenre=" + genre + "\nAvailable=" + available);
	}

	@Override
	public String toString() {
		return "Book Id:" + book_id + "\nTitle:" + title + "\nAuthor:" + author + "\nGenre=" + genre + "\nAvailable=" + available;
	}

	public static void main(String[] args) {
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
	    System.out.println("enter availability(true or false)");
	    available=sc.nextBoolean();
	    book b1=new book(bookId,title,author,genre,available);
	    System.out.println(b1.toString());
	  }
}
