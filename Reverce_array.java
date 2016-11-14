import java.util.Scanner;

class Reverce_array {

  public static void main(String args[]) {

   int num[] = new int[6];
   
   int i,j,tmp;

   Scanner sc = new Scanner(System.in);

   for(i=0;i<num.length;i++)
   {
     System.out.println(" ENTER NUMBER :: ");
     num[i] = sc.nextInt();
   }

   for(i=0,j=num.length-1;i<j;i++,j--)
   {
     tmp = num[i];
     num[i] = num[j];
     num[j] = tmp;
   }

   System.out.println(" REVERSE NUMBER IS :: ");
 
   for(i=0;i<num.length;i++)
   {
     System.out.print(num[i] + ", ");
   } 

  }
 }