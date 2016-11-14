import java.util.Scanner;

class Leaner_search {

   public static void main(String args[]) {

     int i,val,num[]=new int[5];

     Scanner sc = new Scanner(System.in);    

     for(i=0;i<num.length;i++)
     {
       System.out.println(" ENTER NUMBER " + (i+1) + " :: ");
       num[i] = sc.nextInt();
     }

     System.out.println(" ENTER WHICH NUMBER TO SELECT :: ");
     val = sc.nextInt();

     for(i=0;i<num.length;i++) 
     {
         if(num[i] == val)
         {
            System.out.println(" YOUR NUM IS " + (i+1) + " POSITION ");
            break;
         }   
     } 

     if(i == num.length)
     { 
       System.out.println(" YOUR VALUE IS NOT FOUND ");
         
     } 
  } 
 }