import java.util.Scanner;

class Inches_cm
{
  public static void main(String args[])
  {
     float i,c;

     Scanner sc = new Scanner(System.in);
  
     System.out.println(" ENTER INCHES :: ");
     i = sc.nextFloat();

     System.out.println(" CENTIMITER IS :: " + i * 2.5);
  }
}