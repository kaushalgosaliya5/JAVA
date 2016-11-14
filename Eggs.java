import java.util.Scanner;

class Eggs {

 public static void main(String args[]) {

 int numberOfEggs;

 Scanner sc = new Scanner(System.in);

 System.out.println(" ENTER TOTAL Eggs :: ");
 numberOfEggs = sc.nextInt();

  display(numberOfEggs);

 }

 static void display(int numberOfEggs) {
  System.out.println(" TOTAL dozens is :: " + numberOfEggs / 12);
 }

}