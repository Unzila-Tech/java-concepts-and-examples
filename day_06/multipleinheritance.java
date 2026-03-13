package mca;

//Interface A
interface A {
 void methodA();
}

//Interface B
interface B {
 void methodB();
}

//Class C implementing both A and B
class C implements A, B {

 public void methodA() {
     System.out.println("This is method A from Interface A");
 }

 public void methodB() {
     System.out.println("This is method B from Interface B");
 }
}



public class multipleinheritance {
	 public static void main(String[] args) {
	        C obj = new C();
	        obj.methodA();
	        obj.methodB();
	    }
}
