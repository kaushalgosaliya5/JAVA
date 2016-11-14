import java.util.Scanner;

class Interest{

   public static void main(String args[]) {
  
   int p_amt,duration;   // p_amt = princepal amount 
   float roi,interest;   // roi = rate of interest

   Scanner  sc = new Scanner(System.in);

   System.out.println("ENTER PRINCEPAL AMOUNT :: ");
   p_amt = sc.nextInt();

   System.out.println("ENTER RATE OF INTEREST :: ");
   roi = sc.nextFloat();
  
   System.out.println("ENTER NUMBER OF YEAR :: ");
   duration = sc.nextInt();

   interest = p_amt * roi * duration / 100;

   System.out.println(" INTEREST IS :: " + interest);

  }
 }