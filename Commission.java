import java.util.Scanner;

class Commission {

 public static void main(String args[]) {
  
  double figure,rate1;
  int rate2;

  figure = 5000;
  rate1 = 10;
  rate2 = 10;

  computeCommission(figure);
  computeCommission(figure,rate1);
  computeCommission(figure,rate2); 

 }
  public static void computeCommission(double figure){
   System.out.println(" COMMISSION IS :: " + (figure*7.5/100));
  }

  public static void computeCommission(double figure,double rate1){

   System.out.println(" RESULT IS :: " + (figure*rate1/100));
  }
  public static void computeCommission(double figure,int rate2){
 
    System.out.println(" COMMITION IS :: " + (figure*(rate2/100.0)));
  }
}