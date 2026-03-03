package week3;

import java.util.*;
public class Combination {
  static int [] digarr=new int[3];
  static void combinationofdigit() {
	  System.out.println("all possible combinations are:");
	  for(int i=0;i<3;i++) {
		  for(int j=0;j<3;j++) {
			  for(int k=0;k<3;k++) {
				  if(i!=j&&j!=k&&i!=k) {
					  System.out.println(""+digarr[i]+digarr[j]+digarr[k]);
				  }
			  }     
		  }      
	  }
  }
  
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a 3 digit number");
	  for(int i=0;i<3;i++) {
		digarr[i]=sc.nextInt();
	  }
	  
	  combinationofdigit();
	  sc.close();
  }
	
}
