import java.util.Scanner;

class Unchecked {

 public static void main(String args[]){

   int a[] = new int[4];

   try{
   System.out.println(" "  + a[10]);  
   }
   finally{
     System.out.println(" SIZE IS SMOLL OF VARIABLE");
   }
 
 }
}
