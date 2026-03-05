package week4;

import java.util.*;

public class oddandeven {
 static  int[] arr;
 static  int size,i,evencount=0,oddcount=0;
	static void even() {
		for(i=0;i<size;i++) {
			if(arr[i]%2==0) {
				 evencount++;
			}
			
		}
	System.out.println("number of even are:" +evencount);
	}
	
	static void odd() {
		for(i=0;i<size;i++) {
			if(arr[i]%2!=0) {
				 oddcount++;
			}
			
		}
	System.out.println("number of odd are:" +oddcount);
	}
	
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
   	System.out.println("enter a array size");
   	size=sc.nextInt();
    arr=new int[size];
    System.out.println("enter an array element");
    for( i=0;i<size;i++) {
    	arr[i]=sc.nextInt();
    }
    sc.close();
    even();
    odd();
	
  }
}
