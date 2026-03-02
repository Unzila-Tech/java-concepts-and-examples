package mca;

import java.util.*;

	class moduleven {
		 
		static void evencount(int n ,Scanner sc) {
			int even=0;
			int odd=0;
		System.out.println("enter an element");
			for(int i=1;i<=n;i++) {
				int num =sc.nextInt();
				if(num%2==0)
					even++;
				else
				  odd++;
					
			}

			System.out.println("even numbers are="+even);
			System.out.println("odd numbers are="+odd);
	
	}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter how many numbers");
		    int num=sc.nextInt();
		    evencount(num,sc);
		}
	}