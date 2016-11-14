import java.util.Scanner;

class Digit_sum {

  public static void main(String args[]) {

   int i,no,sum;

   Scanner sc = new Scanner(System.in);

   System.out.println(" FIND SUM OF DIGITS TO ENTER ANY NUMBER :: ");
   no = sc.nextInt();

   sum = 0;

   while(no > 0)
   {
     sum = sum + (no % 10);
     no = no / 10; 
   } 

   System.out.println(" SUM OF THE DIGITS IS :: " + sum);
  
  }
 }