import java.util.Scanner;

class Exception_sum {

 public static void main(String args[]) {

   try{

   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]);
    
   int sum = a + b;
   
   System.out.println(" SUM IS :: " + sum);   
   }
   catch(NumberFormatException e){
     System.out.println(" ENTER VALUE TO INTEGER FORMATE");
   }
   catch(ArrayIndexOutOfBoundsException e){
    System.out.println(" YOU HAVE NOT ENTER ANY VALUE");
   }
   
 }
}