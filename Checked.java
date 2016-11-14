import java.util.Scanner;

class Checked {

 public static void main(String args[]) {
     try {
 
     int a=5,b=7;
     System.out.println(a);
     Thread.sleep(5000);      // 500 milysecond to  stop RUN-TIM 
     System.out.println(b);
   }
   catch(InterruptedException e){
    System.out.println(" ERROR OF THREAD IN READ ");
   }
   finally{
    System.out.println(" COMPILED TIME EXCEPTION :: checked");
   }

 }
}