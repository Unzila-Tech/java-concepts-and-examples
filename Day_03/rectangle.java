

import java.util.*;

 class rectang {
   static int x1,y1,w1,h1;
   static int x2,y2,w2,h2;   //left1   = x1  ,bottom1 = y1 ,right1  = x1 + w1,top1    = y1 + h1
	static void intersect() {
		
		    int left = Math.max(x1, x2);
	        int bottom = Math.max(y1, y2);

	        int right = Math.min(x1 + w1, x2 + w2);
	        int top = Math.min(y1 + h1, y2 + h2);

	        if (right > left && top > bottom) {
	            int width = right - left;
	            int height = top - bottom;

	            System.out.println("Intersection: (" + left + ", " + bottom + ", " + width + ", " + height + ")");
	        } 
	        else {
	            System.out.println("No Intersection");
	        }
		
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rectangle 1: x1,y1,w1,h1");
		 x1 = sc.nextInt();
		 y1 = sc.nextInt();
	     w1 = sc.nextInt();
	    h1 = sc.nextInt();
	System.out.println("enter rectangle 2: x2,y2,w2,h2");
	    x2 = sc.nextInt();
	   y2 = sc.nextInt();
	   w2 = sc.nextInt();
	   h2 = sc.nextInt();
	 
	 intersect();
		sc.close();
	}
	
}
