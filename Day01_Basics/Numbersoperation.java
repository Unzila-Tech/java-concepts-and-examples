import java.util.*;
class Numbersoperation{
    
public static void main(String[] args){
    double num;
   
   Scanner in= new Scanner(System.in);    
   System.out.println("input a first number:");
   num =in.nextDouble();
    int intnum=(int)num;
   System.out.println("round value:"+Math.round(num));
   System.out.println("Ceil value:"+Math.ceil(num));
   System.out.println("Floor value:"+Math.floor(num));
   System.out.print("type conversion of value double:"+intnum);

     
       }
}