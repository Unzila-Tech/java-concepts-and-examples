package mca;

interface Shape {
	 double getArea();
	 void draw();
	}

	//Circle Class
	class Circle implements Shape {
	 double radius;
	 double area;


	 Circle(double r) {
	     radius = r;
	     area = getArea();
	 }

	 public double getArea() {
	     return Math.PI * radius * radius;
	 }

	 public void draw() {
	     System.out.println("Drawing Circle...");
	 }

	 // toString method
	 public String toString() {
	     return "Area: " + area;
	 }
	}

	//Rectangle Class
	class Rectangle implements Shape {
	 double length, width;
	 double area;

	 Rectangle(double l, double w) {
	     length = l;
	     width = w;
	     area = getArea();
	 }

	 public double getArea() {
	     return length * width;
	 }

	 public void draw() {
	     System.out.println("Drawing Rectangle...");
	 }

	 public String toString() {
	     return "Area: " + area;
	 }
	}

	//Triangle Class
	class Triangle implements Shape {
	 double base, height;
	 double area;

	 Triangle(double b, double h) {
	     base = b;
	     height = h;
	     area = getArea();
	 }

	 public double getArea() {
	     return 0.5 * base * height;
	 }

	 public void draw() {
	     System.out.println("Drawing Triangle...");
	 }

	 public String toString() {
	     return "Area: " + area;
	 }
	}


public class ShapeMain {
	public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println(c);   // calls toString()
        c.draw();

        Rectangle r = new Rectangle(4, 6);
        System.out.println(r);
        r.draw();

        Triangle t = new Triangle(3, 8);
        System.out.println(t);
        t.draw();
		
    }
}
