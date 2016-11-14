import java.util.Scanner;

class Sum_avg {

  public static void main(String args[]) {

    int i,sum,avg,no;

    Scanner sc = new Scanner(System.in);

    System.out.println(" FIND SUM & AVERAGE ENTER ANY NUMBER :: ");
    no = sc.nextInt(); 

    sum = 0;

    for(i=1;i<=no;i++)
    {
      sum = sum + i;
    }

    avg = sum / no;

    System.out.println(" SUM IS :: " + sum);
    System.out.println(" AVERAGE IS :: " + avg);
  
  }
 }