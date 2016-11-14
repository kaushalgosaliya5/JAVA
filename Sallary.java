import java.util.Scanner;

class Sallary {

  public static void main(String avgs[]) {

   int b_sal,da,hra,n_sal; // b_sal = basic sallary  n_sal = net sallary

   Scanner sc = new Scanner(System.in);

   System.out.println(" ENTER BASIC SALLARY :: ");
   b_sal = sc.nextInt();

   hra = 10;
   da = 15;

   n_sal = b_sal + (b_sal * hra / 100) + (b_sal * da / 100);

   System.out.println(" NET SALLARY IS :: " + n_sal);

  }
 }