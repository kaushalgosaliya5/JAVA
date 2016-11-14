import java.util.Scanner;

class LengthMatchException extends Exception {

}

class Exception_length {

 public static void main(String args[]) {

 try{
 String s = args[0];
 int l = Integer.parseInt(args[1]);

 if(s.length() != l){
   throw new LengthMatchException();
 }

 System.out.println(" string is :: " + s);
 System.out.println(" integer is :: " + l);
 }
 catch(LengthMatchException e) {
   System.out.println(" PLEASE PROPARLY LENGTH ENTER");
 }
 catch(ArrayIndexOutOfBoundsException e) {
   System.out.println(" PLESE ENTER FIRST STRING AND SECOND INTEGER VALUE");
 } 
 catch(NumberFormatException e) {
   System.out.println(" ENTER VALUE FIRST STRING FORMATE SECOND INTEGER FORMATE");
 }



 }
}
