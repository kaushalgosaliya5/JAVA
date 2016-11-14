import java.util.Scanner;

class Array {

  public static void main(String args[]) {

   int i,num[]=new int[10]; 

   Scanner sc = new Scanner(System.in);
  
   for(i=0;i<num.length;i++)
   {
      System.out.println(" ENTER NUMBER " + i + " :: ");
      num[i] = sc.nextInt();
   } 

   for(i=0;i<num.length;i++)
   {
     System.out.println(num[i]);
   }

  }
 }