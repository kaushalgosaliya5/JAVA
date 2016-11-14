import java.util.Scanner;

class Fer_cel {

  public static void main(String args[]) {

    float  fer,cel;

    Scanner sc = new Scanner(System.in);

    System.out.println(" ENTER FERANHIT :: ");
    fer = sc.nextFloat();

    cel = ((fer-32)*5)/9;

    System.out.println(" CELSIOUS IS :: " + cel);
  } 
 }