package mca;
import java.util.*;
public class evens {
   static void evensum(int n,int sum) {
	   
	   for(int i=1;i<=n;i++){
         if(i%2==0){
             sum+=i;
            
         }
     }
     System.out.println("sum of even number=" +sum);
   }
     public static void main(String[] args) {
    	 int sum=0;
    	 Scanner in=new Scanner(System.in);
    	 System.out.println("enter a number");
    	 int n=in.nextInt();
    	 evensum(n,sum);
    	 in.close();
    	
     }
    
   }
  

