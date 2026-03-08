package week5or6;
import java.util.*;
public class catalog {
    private List<book> books;
    public catalog() {
        this.books = new ArrayList<>();
    }
    public void addBook(book b) {
        books.add(b);
    }
    void displayAvailablebook() {
		boolean found=false;
		for(book b:books) {
			if(b.getAvailable()) {
				System.out.print(b);
				found=true;
			}
		}
		if(!found) {
			System.out.println("no book available");
		}
	}
    public void updateBookStatus(int bookID, boolean available) {
        for (book b : books) {
            if (b.getBook_id() == bookID) {
                b.setAvailable(available);
                break;
            }
        }
    }
    public void display() {
    	System.out.print("Catalog:[");
		for(book b:books) {
			System.out.print(b + ",");
		}
		System.out.println("]");
    }
    public static void main(String[] args) {
    	String flag="Yes";
    	int bookId;String title,author,genre;boolean available;
    	Scanner sc=new Scanner(System.in);
    	catalog c1 = new catalog();
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
	    c1.addBook(b1);
	    c1.display();
	    /*book b1=new book(1, "Java Basics", "John Doe", "Programming", true);
	    c1.addBook(b1);
	    c1.display();
	    book b2=new book(2, "Advanced Java", "Jane Smith", "Programming", false);
	    c1.addBook(b2);
	    c1.display();
	    c1.displayAvailablebook();*/
	    while(true) {
		System.out.println("enter 1 for borrow book\n 2 for Display Available books");
			int n=sc.nextInt();
			switch(n) {
			case 1:
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
			    book b2=new book(bookId,title,author,genre,available);
			    c1.addBook(b2);
			    c1.display();
			    break;
			case 2:
				c1.displayAvailablebook();
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("do you want to add more books or want to check available books");
			flag=sc.next();
			if(!flag.equalsIgnoreCase("yes")) {
				break;
			}
    }
}
}