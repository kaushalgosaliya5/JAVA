import java.util.Scanner;

class FlipCoin {

 public static void main(String args[]) {

  double result;

  for(int i=0;i<10;i++){

    result = Math.random();

   if(result <= 0.5){
     System.out.println((i+1) + " HEADS "); 
   }
   else{
    System.out.println((i+1) + " TAILS ");
   }
 
  }

}
}