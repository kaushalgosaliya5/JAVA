import java.util.Scanner;

class Bouble_sort {

  public static void main(String args[]) {

   int num[] = new int[5];
   int i,j,tmp;

   Scanner sc = new Scanner(System.in);

   System.out.println(" ENTER 5 NUMBER TO FIND BOUBLE SORT :: ");
 
   for(i=0;i<num.length;i++)
   {
     System.out.println(" ENTER NUMBER :: ");
     num[i] = sc.nextInt();
   }

   for(i=0;i<num.length-1;i++)
   {
     for(j=0;j<num.length-1;j++)
     { 
        if(num[j] > num[j+1])
        { 
           tmp = num[j];
           num[j] = num[j+1];
           num[j+1] = tmp;
        }
     }
   }
   
   System.out.println(" BOUBLE SORT :: ");

   for(i=0;i<num.length;i++)
   {
      System.out.print(num[i] + " , ");    
   }

  }
 }