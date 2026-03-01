import java.util.*;
class Numbers{
    
public static void main(String[] args){
    
int num1;
int num2;
    
   Scanner in= new Scanner(System.in);    
   System.out.println("input a first number:");
   num1 =in.nextInt();
   System.out.println("input a second number:");
   num2 =in.nextInt();
   System.out.println("sum of two number:"+(num1+num2));
   System.out.println("difference of two number:"+(num1-num2));
   System.out.println("product of two number:"+(num1*num2));
   if(num2==0){
    System.out.println("does't divide");
  }
else{
     System.out.println("quotient of two number:"+(num1/num2));
}
   
   System.out.println(" minimum : "+Math.min(num1,num2));
   
   System.out.println("maximum: "+Math.max(num1,num2));

 }

}