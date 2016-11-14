import java.util.Scanner;

class Static_methord {
 
  public static void main(String args[]) {

  String s = "abc123KSL";
  int l=0,d=0,j=0,u=0,lo=0;

  for(int i=0;i<s.length();i++){
    if(Character.isLetter(s.charAt(i))) {
        l++;
    }
    if(Character.isDigit(s.charAt(i))) {
       d++;
    }
    if(Character.isLetterOrDigit(s.charAt(i))) {
      j++;
    }  
    if(Character.isUpperCase(s.charAt(i))){
        u++;
    } 
    if(Character.isLowerCase(s.charAt(i))){
       lo++;
    }
  }
  
  System.out.println(" letter is :: " + l);
  System.out.println(" digit is :: " + d);
  System.out.println(" total letter and digit is :: " + j);
  System.out.println(" upper case is :: " + u);
  System.out.println(" LOWER CASE IS :: " + lo);

  char ksl = Character.toLowerCase(s.charAt(7)); 
  System.out.println(" lower case is :: " + ksl); 

  char ksl1 = Character.toUpperCase(s.charAt(1));
  System.out.println(" upper case is :: " + ksl1);

 }
}