import java.util.Scanner;

class Selection_sort {

  public static void main(String args[]) {

   int num[] = new int[5];
   int i,j,tmp;

   Scanner sc = new Scanner(System.in);

   System.out.println(" ENTER 5 NUMBER TO FIND SELECTIONA SORT :: ");
 
   for(i=0;i<num.length;i++)
   {
     System.out.println(" ENTER NUMBER :: ");
     num[i] = sc.nextInt();
   }

   for(i=0;i<num.length-1;i++)
   {
     for(j=i+1;j<num.length;j++)
     { 
        if(num[i] > num[j])
        { 
           tmp = num[i];
           num[i] = num[j];
           num[j] = tmp;
        }
     }
   }
   
   System.out.println(" SELECTION SORT :: ");

   for(i=0;i<num.length;i++)
   {
      System.out.print(num[i] + " , ");    
   }

  }
 }