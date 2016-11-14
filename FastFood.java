import java.util.Scanner;

class FastFood {

 public static void main(String args[]) {

 int ch;
 float bill=0;
   
   Scanner sc = new Scanner(System.in);

 do{
    System.out.println(" 1.Cheeseburger 4.99");
    System.out.println(" 2.Pepsi        2.00");
    System.out.println(" 3.Chips        0.75");

    System.out.println(" ENTER CHICE :: ");
    ch = sc.nextInt();
  
    switch(ch) {
     case 1 : bill += 4.99;break;
     case 2 : bill += 2.00;break;
     case 3 : bill += 0.75;break;
     default :
              System.out.println(" PROPARLY VALUE ENTER ");
    }

  }while(ch != 0); 

  System.out.println(" BILL IS :: " + bill);

}
}