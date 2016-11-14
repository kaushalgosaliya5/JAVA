import java.util.Scanner;

class Sallary1 {

 public static void main(String args[]) {

  double hours;

  Scanner sc = new Scanner(System.in);

  System.out.println(" ENTER HOURS IS :: ");
  hours = sc.nextDouble();

  System.out.println(" ENTER SALLARY IS :: " + calculation(hours));

 }
  
 static double calculation(double hours){

  double over;

  if(hours <= 40){
   return hours * 25;
  }
  else{
  over = hours % 40;
  return ((40*25)+(over*(25*1.5)));
  }
 }

}


