import java.util.Scanner;

class Factorial {

    public static void main(String args[]) {

     int no,i,fact;

     Scanner sc = new Scanner(System.in);
 
     System.out.println(" FIND FACTORIAL TO ENTER ANY NUMBER :: ");
     no = sc.nextInt();

     i = 1;
     fact = 1;

     while(i <= no)
     {
       fact = fact * i;
       i++;
     }

    System.out.println(" YOUR NUM " + no + " FACTORIAL IS :: " + fact);
  } 
 }