package mca;
import java.util.*;
public class reciprocal {

	static void recipro(int n ,double sum) {
		 for(int i=1;i<=n; i++){
	          sum+=1.0/i;
	             
	        }
	      System.out.println("sum of reciprocals:"+sum);
	}
	
	public static void main(String[] args) {
		double sum=0.0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number");
        int n=sc.nextInt();
        recipro(n,sum);
	}
	
}
