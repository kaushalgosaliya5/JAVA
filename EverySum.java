import java.util.Scanner;

class EverySum {

 public static void main(String args[]) {

  int i,j,sum=0,n; 
  
  Scanner sc = new Scanner(System.in);

  System.out.println(" ENTER NUMBER :: "); 
  n = sc.nextInt();

  for(i=1;sum <= n;i++) {
   sum = 0;
   for(j=1;j<i;j++){
      sum = sum + j;
     System.out.print("  " + j);
   }
   System.out.println(" :: " + sum + "\n");
  }


}
}