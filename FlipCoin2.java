import java.util.Scanner;

class FlipCoin2 {

 public static void main(String args[]) {

  double result;
  float h,t;
  int a=0,b=0;

  for(int i=0;i<1000;i++){

    result = Math.random();

   if(result <= 0.5){
       a++;
   }
   else{
      b++;
   } 
  }

   h = (float)(a*100)/1000;
   t = (float)(b*100)/1000;

   System.out.println(" HEAD PERCENTAGES IS :: " + h);
   System.out.println(" TAIL PERCENTAGES IS :: " + t);

}
}