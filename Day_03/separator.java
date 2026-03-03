package mca;

import java.util.*;
public class separator {
	static int num;
	static void digitseparator() {
		int dig1=num/1000;
		int dig2=(num/100)%10;
		int dig3=(num/10)%10;
		int dig4=num%10;
		
		System.out.println(dig1);
		System.out.println(dig2);
		System.out.println(dig3);
		System.out.println(dig4);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a 4 digit number");
		 num=sc.nextInt();
		 digitseparator();
		sc.close();
	}

}
