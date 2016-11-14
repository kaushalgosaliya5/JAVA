import java.util.Scanner;

class Try_catch {

  public static void main(String args[]) {
   
  try {

     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]); 

     int c = a / b;

     System.out.println(" DIVITION IS :: " + c);

     System.out.println(" LAST LINE OF TRY BLOCK ");
  }
  catch(NumberFormatException e) {
    System.out.println(" INPUT NUMBER FOR INTEGER FORMATE ");
  }  
  catch(ArrayIndexOutOfBoundsException e) {
    System.out.println(" YOU ARE NOT ENTER VALUE ");
  }
  catch(ArithmeticException e) {
    System.out.println(" PLEASE PROPARLY VALUE TO ENTER");
  }


 }
}