import java.util.Scanner;

class Bitwise
{
   public static void main(String args[])
   {
      int i;

      for(i=1;(1<<i)<=1024;i++)
      {
         System.out.println("  " + (1<<i));
      } 
   }
}