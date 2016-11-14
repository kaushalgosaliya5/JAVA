import java.util.Scanner;

class Square {

  public static void main(String args[]) {

     int no;

     Scanner sc = new Scanner(System.in);
     
     System.out.println(" ENTER THE NUMBER :: ");

     no = sc.nextInt();

     System.out.println(" SQUARE :: " + (no*no));
  }
 }