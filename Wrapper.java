import java.util.Scanner;

class Wrapper {

 public static void main(String args[]) {

  String s = "abc123#";

  int i,digit = 0;
   
  for(i=0;i<s.length();i++)
  {
     if(Character.isDigit(s.charAt(i)))
     {
       digit++;
     }
  }
     
  System.out.println(" DIGIT IS :: " + digit);

  System.out.println("  REPLACE IS 'a' to 'e' :: " + s.replace('a','e'));   

 }  
}
















