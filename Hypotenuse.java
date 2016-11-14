import java.util.Scanner;

class Hypotenuse
{
  public static void main(String args[])
  {
    int x,y;
    double z;

    Scanner sc = new Scanner(System.in);

    System.out.print(" ENTER BASE :: ");
    x = sc.nextInt();

    System.out.print(" ENTER HEIGHT :: ");
    y = sc.nextInt();

    z = Math.sqrt((x*x)+(y*y));

    System.out.println(" HYPOTENUSE IS :: " + z);   }
}