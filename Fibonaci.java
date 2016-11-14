import java.util.Scanner;

class Fibonaci {

  public static void main(String avgs[]) {

    int n1,n2,sum,no;
  
    Scanner sc = new Scanner(System.in);    

    System.out.println(" ENTER ANY NUMBER :: ");
    no = sc.nextInt();

    n1 = 0;
    n2 = 1;

    sum = n1 + n2;

    System.out.println(" YOUR FIBONACI SERICES IS :: ");

    while(sum <= no)
    {
      System.out.println(sum);

      n1 = n2;
      n2 = sum;
      sum = n1+n2;
    } 

  } 
 }
