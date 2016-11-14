import java.util.Scanner;

class Maximum
{
  public static void main(String args[]) 
  {
    int n1,n2;
 
    Scanner sc = new Scanner(System.in);
 
    System.out.println(" ENTER FIRST NUMBER :: ");
    n1 = sc.nextInt();

    System.out.println(" ENTER SECOND NUMBER :: ");
    n2 = sc.nextInt();

    if(n1 > n2)
    {
      System.out.print(" FIRST IS MAX ");
    }
    else
    {
      System.out.print(" SECOND IS MAX ");
    }
  }
}