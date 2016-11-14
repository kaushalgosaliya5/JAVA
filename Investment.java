import java.util.Scanner;

class Investment {
 
 public static void main(String args[]) {

 int money,year;
 float r = 8,interest=0;

 Scanner sc = new Scanner(System.in);

 System.out.println(" ENTER MONEY :: ");
 money = sc.nextInt();

 System.out.println(" ENTER NUMBER OF YEAR :: ");
 year = sc.nextInt();

 for(int i=0;i<year;i++){
   interest = interest + (money*r/100);
 }  

 System.out.println(" INTEREST IS :: " + interest);

}
}