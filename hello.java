import java.util.Scanner;

class Recursion {

 public static void main(String args[]) {

   int n;

   Scanner sc = new Scanner(System.in);
  
   System.out.println(" ENTER NUMBER :: ");
   n = sc.nextInt();

   System.out.println(" factorial is :: " + factorial(n));
 
 }


 static int factorial(int n) {

  if(n == 1) {
    return 1;
  }
  else{
     return (n*factorial(n-1));
  }
 }

}