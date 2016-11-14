import java.util.Scanner;

class Multiplication_table {
   
   public static void main(String args[]) {
  
   int i,num,x;

   Scanner sc = new Scanner(System.in);
 
   System.out.println(" SHOW MULTIPLICATION TABLE TO ENTER ANY NUMBER :: ");
   num = sc.nextInt();

   i = 1;

   while(i <= 10)
   {
     x = num * i; 
    
     System.out.println( num + " * " + i + " = " + x);
      
     i++;
   }

  } 
 }