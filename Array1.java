import java.util.Scanner;
import java.util.Arrays;

class Array1 {

 public static void main(String args[]) {

   int a[] = {5,3,7,2,8};

   Arrays.sort(a);

   for(int val : a) {
     System.out.print("  " + val);    // arrays value to display
   }

   System.out.println("");

   Arrays.fill(a,5);

   for(int val : a) {
     System.out.print("  " + val );   // bydefault value is 5 
   }

  }
}