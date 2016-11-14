import java.util.Scanner;

class Armastrong {

  public static void main(String args[]) {
   
   int no,rem,onum,sum;

   Scanner sc = new Scanner(System.in);

   System.out.println(" CHECK GIVEN NO IS ARMASTRONG OR NOT TO ENTER ANY NUMBER :: ");
   no = sc.nextInt();

   onum = no;
   sum = 0; 

   while(no > 0)
   {
     rem = no % 10;
     sum = sum + (rem*rem*rem);
     no = no / 10;
   }

   if(onum == sum)
   {
     System.out.println(" GIVEN NUM IS ARMASTRONG :: " + onum);
   }
   else
   {
     System.out.println(" GIVEN NUM IS NOT ARMASTRONG :: " + onum);
   }

  }
 }