package mca;

import java.util.Scanner;
class Lexico {
    String s1, s2, s3;   
    Lexico(String a, String b, String c) {
        s1 = a;
        s2 = b;
        s3 = c;
        sortStrings();
    }
    void sortStrings() {
        String temp;
        if (s1.compareTo(s2) > 0) {
            temp = s1; 
            s1 = s2; 
            s2 = temp;
        }

        if (s1.compareTo(s3) > 0) {
            temp = s1; 
            s1 = s3; 
            s3 = temp;
        }

        if (s2.compareTo(s3) > 0) {
            temp = s2; 
            s2 = s3; 
            s3 = temp;
        }
    }

    // toString method
    public String toString() {
        return "Sorted Strings: " + s1 + ", " + s2 + ", " + s3;
    }
}

public class laxico_sorting {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 3 strings:");
	         String a = sc.nextLine();
	        String b = sc.nextLine();
	        String c = sc.nextLine();
	        Lexico l = new Lexico(a, b, c);
	        System.out.println(l);
	        sc.close();
	    }
	
}
