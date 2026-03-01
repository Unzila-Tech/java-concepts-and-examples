import java.util.*;
class MathClassUsage{
    
public static void main(String[] args){ 
        int num;
      Scanner in= new Scanner(System.in);    
   System.out.println("input a first number:");
   num =in.nextInt();   
   System.out.println("absolute of num:"+Math.abs(num));
    System.out.println("square root of num:"+Math.sqrt(num));
    System.out.println("power of num :"+Math.pow(num,2));
 System.out.println(" sine of num:"+Math.sin(num));
 System.out.println("cosine of num:"+Math.cos(num));
   }
}