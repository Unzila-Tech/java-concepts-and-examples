package mca;
import java.util.*;
public class switchweek6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n==== MENU PROGRAM ====");
	            System.out.println("1. Reverse String Program");
	            System.out.println("2. Multiple Inheritance Program");
	            System.out.println("3. Lexicographical Sorting Program");
	            System.out.println("4. Shape Program");
	            System.out.println("0. Exit");
	            System.out.print("Enter Choice: ");

	            int ch = sc.nextInt();

	            switch (ch) {

	                case 1:
	                    Rever_Main.main(null);   
	                    break;

	                case 2:
	                    multipleinheritance.main(null);
	                    break;

	                case 3:
	                    laxico_sorting.main(null);
	                    break;

	                case 4:
	                    ShapeMain.main(null);
	                    break;

	                case 0:
	                    System.out.println("Exit...");
	                    System.exit(0);

	                default:
	                    System.out.println("Wrong Choice ");
	            }
	        }
	    }
}
