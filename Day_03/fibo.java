package week3;
import java.util.*;
public class fibo {

	static void fiboseries(int n) {
		int num1=0;
		int num2=1;
		int count =1;
    System.out.println("fibonacci series:");
	do {
	System.out.println(num1+" ");
      int curr=num1+num2;
      num1=num2;
      num2=curr;
      count++;
	}while(count<=n);
 }
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		fiboseries(n);
		sc.close();
	}
	
}
