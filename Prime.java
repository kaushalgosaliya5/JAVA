import java.util.Scanner;

  class Prime {
     
   public static void main(String args[]) {
  
   int i,no,logic; 

   Scanner sc = new Scanner(System.in);

   System.out.println(" FIND PRIME NUMBER TO ENTER ANY NUMBER :: "); 
   no = sc.nextInt();

   i = 2;
   logic = 1;

   while(i < no)
   {
     if(no % i == 0)
     {
       logic = 0;
       break;
     }

    i++;
   }      

    
   if(logic == 1)
   {
     System.out.println(" GIVEN NUMBER IS PRIME :: " + no);
   }
   else
   {
    System.out.println(" GIVEN NUMBER IS NOT PRIME :: " + no);
   }   

  }   
 }



