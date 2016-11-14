import java.util.Scanner;

class NoMatchException extends Exception {
}

class Exception_string {

  public static void main(String args[]) {

  

  try {      
       String s1 = args[0];

     if(s1.compareTo("internet") != 0) {
          throw new NoMatchException();
      }
      
     System.out.println(" YOUR SPELLING IS CORRECT ");
   }
   catch(NoMatchException e) {
       System.out.println(" NOT MATCH STRING");
   }
   catch(ArrayIndexOutOfBoundsException e){
       System.out.println(" INSERT 'internet' SPELLING");
   }  
   
 
 }
}