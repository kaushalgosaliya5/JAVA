import java.util.Scanner;

class Insertion_sort {

  public static void main(String args[]) {

   int num[] = new int[5];
   int i,j,tmp;

   Scanner sc = new Scanner(System.in);

   System.out.println(" ENTER 5 NUMBER TO FIND INSERTION SORT :: ");
 
   for(i=0;i<num.length;i++)
   {
     System.out.println(" ENTER NUMBER " + (i+1) + ":: ");
     num[i] = sc.nextInt();
   }

   for(i=1;i<num.length;i++)
   {
     j = i;
     
     while(j > 0 && num[j] < num[j-1])
     {
       tmp = num[j];
       num[j] = num[j-1];
       num[j-1] = tmp;

       j--;
     }
   } 
   
   System.out.println(" INSERTION SORT :: ");

   for(i=0;i<num.length;i++)
   {
      System.out.print(num[i] + " , ");    
   }

  }
 }