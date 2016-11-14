import java.util.Scanner;

class Sub_3 {

  public static void main(String args[]) {

   int i,sum=0,avg;
   int sub[]=new int[3]; 

   Scanner sc = new Scanner(System.in);
  
   for(i=0;i<sub.length;i++)
   {
      System.out.println(" ENTER NUMBER " + i + " :: ");
      sub[i] = sc.nextInt();

      sum = sum + sub[i];
   } 

   avg = sum / sub.length;

   if(avg > 80)
   {
     System.out.println(" A ");
   }
   else if(avg > 60)
   {
     System.out.println(" B ");
   }
   else if(avg > 40)
   {
     System.out.println(" C ");
   }
   else 
   { 
      System.out.println(" PASS ");
   } 

  }
 }