import java.util.Scanner;

class Sb_methord {

 public static void main(String args[]) {

   StringBuffer sb = new StringBuffer("JAVA");
  
   String s = sb.toString();  // convert stringBuffer to string

   System.out.println(" CONVERT TO String-Buffer to string :: " + s);
    
   System.out.println(" REVERSE STRING :: " + sb.reverse());

   System.out.println(" APPEND IS :: " + sb.append(" KSL "));

   System.out.println(" INSERT IS :: " + sb.insert(0," hell "));

   sb.setCharAt(0,'A');

   System.out.println(" INDEX POSITION TO CHARECTER VALUE :: " + sb);
  
 }
}