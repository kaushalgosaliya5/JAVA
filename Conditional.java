import java.util.Scanner;

class Conditional{

  public static void main(String args[]) {

    int n1,n2,n3,max;

  Scanner sc = new Scanner(System.in);

  System.out.println(" ENTER FIRST NUMBER :: ");
  n1 = sc.nextInt();

  System.out.println(" ENTER SECOND NUMBER :: ");
  n2 = sc.nextInt();

  System.out.println(" ENTER THIRD NUMBER :: ");
  n3 = sc.nextInt();

max =  ( n1>n2 && n1>n3 ) ? n1 : (n2>n3) ? n2 : n3; 

  // max = (x>y) ? (x>z) ? x : z : (y>z) ? y : z;


  System.out.println(" MAX IS :: " + max);
          
 }
}