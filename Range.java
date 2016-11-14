import java.util.Scanner;

class RangeException extends Exception {
}

class Range {
 
  public static void main(String args[]) {

  try {

  int a[] = new int[5];
  int sum=0;

  Scanner sc = new Scanner(System.in);

  for(int i=0;i<a.length;i++){
    System.out.println(" ENTER NUMBER " + (i+1) + " :: ");
    a[i] = sc.nextInt();

     if(a[i] > 100 || a[i] < 0){
         throw new RangeException();
     }

    sum += a[i];
   }

  System.out.println(" SUM IS :: " + sum);
  System.out.println(" AVERAGE IS :: " + sum / 5);

  }
  catch(RangeException e) {
     System.out.println(" YOUR VALUE IS OUT OF RANGE (0-100)");
  } 

}
}