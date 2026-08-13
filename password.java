public class password {
     public static int checkPass(String str){
        if(str.length()<=4){
            return 0;
        }
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            return 0;
        }
        boolean hasDigit=false;
        boolean hasCapital=false;
        for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(ch==' '|| ch=='/'){
            return 0;
          }
          if(ch>='A'&&ch<='Z'){
            hasCapital=true;
           
          }
          if(ch>='0'&&ch<='9'){
            hasDigit=true;
          }
        }
        if(hasCapital && hasDigit){
            return 1;
        }
        return 0;
     }
     public static void main(String[] args) {
        String str="bB1_89";
         System.out.println(checkPass(str));
     }
}
