import java.util.Scanner;

class FehrenheitToCelsius {

  public static void main(String args[]) {

  double fer,cel;

  Scanner sc = new Scanner(System.in);

  System.out.println(" ENTER FEHRENHEIT VALUE :: ");
  fer = sc.nextDouble();

  cel = ((fer-32)*5)/9;


   System.out.println(" CELSIOUS VALUE IS :: " + cel);
}
}