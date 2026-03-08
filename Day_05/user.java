package week5or6;
import java.util.*;
public class user {
	int userId;String name;
	List<Integer> borrowedBookId=new ArrayList<>();
	public user(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void borrowBook(int bookId) {
		borrowedBookId.add(bookId);
	}
	void returnBook(int bookId) {
		borrowedBookId.remove(Integer.valueOf(bookId));
	}
	void display() {
		System.out.println("User ID: " + userId);
		System.out.println("NAME: " + name);
		System.out.println("Borrowed Books: " + borrowedBookId);
	}
	public static void main(String[] args) {
		String flag="Yes";
		Scanner sc=new Scanner(System.in);
		int userid;String name;
		System.out.println("enter userId");
		userid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		name=sc.nextLine();
		user u1=new user(userid,name);
		while(true) {
			System.out.println("enter 1 for borrow book\n 2 for return book");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("enter bookId");
				int bookid=sc.nextInt();
				u1.borrowBook(bookid);
				break;
			case 2:
				System.out.println("enter bookid you want to return");
				int bookId=sc.nextInt();
				u1.returnBook(bookId);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("do you want to enter or remove more books");
			flag=sc.next();
			if(!flag.equalsIgnoreCase("yes")) {
				break;
			}
		}
		u1.display();
	}

}
