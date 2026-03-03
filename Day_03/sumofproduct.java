package week3;

import java.util.*;

public class sumofproduct {
	 static int sum=0,product=1;
	 static  int size;
	 static  int [] arr;
  static void sumofnumbers() {
	 
	  for(int i=0;i<size;i++) {
		  sum+=arr[i]; 
	  }
	  System.out.println("sum:" +sum);
	  
  }
  
  static void productofnumbers() {
	  for(int i=0;i<size;i++) {
		  product*=arr[i];
	  }
	  System.out.println("product:" +product);
    }
  
  
  
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	 
	  System.out.println("input an array size");
	  size=sc.nextInt();
	    arr=new int [size];
	  System.out.println("input an array ");
	  for(int i=0;i<size;i++) {
		 arr[i]=sc.nextInt();
	  }
	
	 sc.close();
	  sumofnumbers(); 
	  productofnumbers();
	 
  }
}
