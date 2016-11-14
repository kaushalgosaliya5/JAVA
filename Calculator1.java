import java.util.Scanner;

class Calculator1 {
 
 public static void main(String args[]) {

  double fprice,price,com,dis;
  
  Scanner sc = new Scanner(System.in);

  System.out.println(" ENTER PRODUCT PRICE :: ");
  price = sc.nextDouble(); 

  System.out.println(" ENTER COMMITION (%) :: ");
  com = sc.nextDouble();

  System.out.println(" ENTER DISCOUNT (%) :: ");
  dis = sc.nextDouble();

   fprice = calculation(price,com,dis);  

   System.out.println(" FINAL PRICE IS :: " + fprice);

  }

  static double calculation(double price,double com,double dis){

   return price + (price*com/100) - (price*dis/100);

  }  

}