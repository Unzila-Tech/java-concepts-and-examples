package mca;

import java.util.*;

public class circle {
    static int radius,x,y,cx,cy;
    static float pi=3.14f;
    
	static void areaofcircle() {
		double area=pi*radius*radius;
		
		System.out.println("Area of circle:"+area);
	}
	static void perimeterofcircle() {
		
		double perimeter=2*pi*radius;
		
		System.out.println("Perimeter of circle:" + perimeter);
	}
	
	static void checkpoint() {
		double distance=Math.sqrt((x-cx)*(x-cx)+(y-cy)*(y-cy));
		if(distance<=radius) {
			System.out.println("("+x+" ,"+y+")"+"Inside a circle");
		}
		else {
			System.out.println("("+x+" ,"+y+")"+"Outside a circle");
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter radius");
		radius = sc.nextInt();
		System.out.println("enter point(cx,cy):");
		cx=sc.nextInt();
		cy=sc.nextInt();
		System.out.println("enter point(x,y):");
		x=sc.nextInt();
		y=sc.nextInt();
		
		areaofcircle();
		perimeterofcircle();
		checkpoint();
		
		sc.close();
		
	}
	
}
