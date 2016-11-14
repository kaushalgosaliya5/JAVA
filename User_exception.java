import java.util.Scanner;

class NegativeOperandException extends Exception {

}

class User_exception {
 
  public static void main(String args[]) {
   
    try{
       float a = Float.parseFloat(args[0]);
       float b = Float.parseFloat(args[1]);

       if(a < 0 || b < 0){ 
         throw new NegativeOperandException();   // user define Exception
        }
        
        float c = a / b;
         
        System.out.println(" ANS IS :: " + c);
       }
       catch(NegativeOperandException e) {
          System.out.println(" PLEASE ENTER POSITIVE VALUES ");
       }
       catch(ArithmeticException e) {
          System.out.println(" PLEASE PROPARLY VALUE TO ENTER");
       }
       catch(ArrayIndexOutOfBoundsException e) {
          System.out.println(" YOU HAVE ANY NOT ENTER A VALUE ");
       }
 /*    catch(NumberFormatException e) {
          System.out.println(" INPUT VALUE INTEGER FORMATE ");
       }
 */    finally {
          System.out.println(" FINALLY BLOCK ");
       }

     // c:\java> java User_exception 8 4.5
   
 }
}