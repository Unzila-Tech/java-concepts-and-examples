import java.util.*;
class Student{
  public static void main(String[] args){
       int  houseno;
       String street,city,country;
       String area;
      Scanner in= new Scanner(System.in); 

      System.out.println("input a house no.:");
      houseno=in.nextInt();
      in.nextLine();
     System.out.println("input an street:");
      street=in.nextLine();
    System.out.println("input an city:");
      city=in.nextLine();
     System.out.println("input an country:");
      country=in.nextLine();

 System.out.println("student address are:" +houseno+","+street+","+city+","+country);
 
     }     
}
