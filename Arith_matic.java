import java.util.Scanner;

class Arith_matic {
  
  public static void main(String args[]) {

    int num[]=new int[10];
    int i,avg,sum=0;
    int min,max;
 
    Scanner  sc = new Scanner(System.in);

    for(i=0;i<num.length;i++)
    {
       System.out.println(" ENTER NUMBER :: ");
       num[i] = sc.nextInt();

       sum = sum + num[i];
    }

    avg = sum / num.length;

    min = num[0];
    max = num[0];

    for(i=1;i<num.length;i++)
    {
      if(num[i] > max)
      {
        max = num[i];
      }
 
      if(num[i] < min)
      {
        min = num[i];
      }
    }

   System.out.println(" SUM IS :: " + sum);
   System.out.println(" AVERAGE IS :: " + avg);
   System.out.println(" MINIMUN IS :: " + min);
   System.out.println(" MAXIMUM IS :: " + max);
    
  }
 }