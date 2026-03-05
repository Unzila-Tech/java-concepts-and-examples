package java_code;
import java.util.*;
public class sales {
	static double sales;
    static double commission;
	static void commision_of_sales() {
		
	 if(sales<0) {
		System.out.println("invalid input");
		}
		else if(sales<=500) {
		commission =sales*2/100;
		}
		else if(sales>=500 && sales <=5000) {
			commission =sales*5/100;
		}
		else if(sales>=5000) {
			commission =sales*8/100;
		}
		
		else{
			System.out.println("No match found");
		}
		System.out.println("commision are:"+commission);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sales");
	     sales = sc.nextDouble();
	     commision_of_sales();
	     sc.close();
	}
}
