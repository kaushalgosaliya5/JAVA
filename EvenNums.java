import java.util.Scanner;

class EvenNums {

 public static void main(String args[]) {


  for(int i=2;i<=100;i++){
 
   if(i % 2 == 0){
    System.out.print(" " + i);
 
      if(i % 20 == 0){
       System.out.println("");
      }
   }
  }

}
}