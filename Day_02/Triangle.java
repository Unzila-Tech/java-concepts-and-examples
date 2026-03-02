package mca;
import java.util.*;
public class triangle {

	static void trianglenumbers(int n,int num) {
		
		 for(int i=1;i<=n;i++){
		        for(int j=1;j<=i;j++){
		        System.out.print(num + " ");
		       num++;
		     }
		    System.out.println();
		    }

	}
	
	static void trianglealter(int n) {
		
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		    	
		    	if((i+j)%2==0) {
		    	   System.out.print("1 ");
		    	}
		    	else {
		    		System.out.print("0 ");
		    	}
		   
		    }
		    System.out.println();
		  }
	}
	
	public static void main(String[] args) {
		int num=1;
		 Scanner sc = new Scanner(System.in);
	        System.out.println("enter number of rows");
	        int n=sc.nextInt();
	        trianglenumbers(n,num);
	        System.out.println();
	        trianglealter(n);
	        sc.close();    
	}
	
}
