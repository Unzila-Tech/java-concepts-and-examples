package java_code;
import java.util.*;
public class sentence {
   static String text;
   static char target;
   
   static int wordcount=0,sentencecount=0,lettercount=0;
   
	static void wordcount() {
		 boolean inside=false;
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			if(ch!=' '&&ch!='\n'&&ch!='\t') {
				if(!inside) {
					wordcount++;
					inside=true;
				}
			}else {
					inside=false;
				} 
			
			 
		}
		System.out.println("Number of word are:" +wordcount);
	}
	
	static void sentencecount() {
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
		     if(ch=='.'|| ch=='!' || ch=='?') {
		    	 sentencecount++;
		     }
		}
		 System.out.println("Number of sentence are:" +sentencecount);
	}
  static void occurancechar() {
	  for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
	
			if(ch== target || ch==target+32||ch==target-32) {
				lettercount++;
			}
		 
	  }
	  System.out.println("Number of letter "+target+" are:" +lettercount);
	  
  }
  
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      System.out.println("enter a sentence text");
      text=sc.nextLine();
      System.out.println("enter a letter to count");
      
    	  target=sc.next().charAt(0);
      
      System.out.println("Results!");
      wordcount();
      sentencecount();
      occurancechar();
      sc.close();
   }
}
