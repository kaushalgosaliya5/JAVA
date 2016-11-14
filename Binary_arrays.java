import java.util.Arrays;

class Binary_arrays {

 public static void main(String args[]) {
   
   int a[] = {5,3,7,6,2};

   Arrays.sort(a);

   // sort is (2,3,5,6,7)

   int pos = Arrays.binarySearch(a,6); // position of 6 is ('3'+1) is 4

   System.out.println(" POSITION OF '6' IS :: " + pos);
 
 }
}