import java.util.Scanner;

class Algebraic
{
  public static void main(String args[])
  {
     int n1,n2;

     Scanner sc = new Scanner(System.in);

     System.out.println(" ENTER FIRST NUMBER :: ");
     n1 = sc.nextInt();

     System.out.println(" ENTER SECOND NUMBER :: ");
     n2 = sc.nextInt();

     System.out.println(" ADDITION IS :: " + (n1+n2));
     System.out.println(" SUBSTICTION IS ::  :: " + (n1-n2));
     System.out.println(" MULTIPLICATION IS :: " + (n1*n2));
     System.out.println(" DIVITION IS :: " + (n1/n2));
     System.out.println(" MODULO IS :: " + (n1%n2)); 
  }
}