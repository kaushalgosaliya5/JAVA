import java.util.Scanner;

class Base_exponent {

  public static void main(String args[]) {

   int b,e,ans,i;
 
   Scanner sc = new Scanner(System.in);

   System.out.println(" ENTER BASE :: ");
   b = sc.nextInt();

   System.out.println(" ENTER EXPONENT :: ");
   e = sc.nextInt();

   ans = 1;

   for(i=1;i<=e;i++) 
   {
     ans = ans * b;
   }      

   System.out.println("BASE IS " + b + " EXPONENT IS " + e + " ANS IS :: " + ans);

  } 
 }