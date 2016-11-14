import java.util.Scanner;

class Max_min {

   public static void main(String args[]) {

   int n1,n2,n3;

   Scanner sc = new Scanner(System.in);

   System.out.println(" ENTER FIRST NUMBER :: ");
   n1 = sc.nextInt();

   System.out.println(" ENTER SECOND NUMBER :: ");
   n2 = sc.nextInt();

   System.out.println(" ENTER THIRD NUMBER :: ");
   n3 = sc.nextInt();

   if(n1 > n2)
   {
      if(n1 > n3)
       {
         System.out.println(" FIRST IS MAX :: " + n1);
       }
      else
       {
         System.out.println(" THIRD IS MAX :: " + n3);
       } 
   }
   else
   {
      if(n2 > n3)
      {
         System.out.println(" SECOND IS MAX :: " + n2);
      }
      else
      {
         System.out.println(" THIRD IS MAX :: " + n3);
      }
   }

   if(n1 < n2)
   {
     if(n1 < n3)
     {
       System.out.println(" FIRST IS MIN :: " + n1);
     }
     else
     {
       System.out.println(" THIRD IS MIN :: " + n3);
     }  
   }
   else
   {
     if(n2 < n3)
     {
       System.out.println(" SECOND IS MIN :: " + n2);
     }
     else
     {
       System.out.println(" THIRD IS MIN :: " + n3);
     }
   }

  }  
 }