import java.util.Scanner;

class Number {
 
 public static void main(String args[]) {

  int n;

  Scanner sc = new Scanner(System.in);  

  System.out.println(" ENTER NUMBER :: ");
  n = sc.nextInt();

  display(n);
 }

 static void display (int n) {

  if(n != 0)
  {
   display(n - 1);
   System.out.println("  " + n);
  }
  
 }
}