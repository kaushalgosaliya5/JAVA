import java.util.Scanner;

class Investment2 {
 
 public static void main(String args[]) {

 int money,year;
 float r,interest=0;

 Scanner sc = new Scanner(System.in);

 System.out.println(" ENTER MONEY :: ");
 money = sc.nextInt();

 System.out.println(" ENTER RATE OF INTEREST :: ");
 r = sc.nextFloat();

 System.out.println(" ENTER NUMBER OF YEAR :: ");
 year = sc.nextInt();


 if(r < 0) {
   System.out.println(" ERROR IN RATE OF INTEREST ");
   r = 0;
 }

 for(int i=0;i<year;i++){
   interest = interest + (money*r/100);
 }  

 System.out.println(" INTEREST IS :: " + interest);

}
}