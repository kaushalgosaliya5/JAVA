import java.util.Scanner;

class Even_odd{
  
    public static void main(String args[]) {

      int no,i;
       
      Scanner sc = new Scanner(System.in);

      System.out.println(" ENTER ANY NUMBER :: ");
      no = sc.nextInt();

      i = no % 2;

      if(i == 0)
      {
        System.out.println(" YOUR NUM IS EVEN :: " + no);
      }
      else
      { 
        System.out.println(" YOUR NUM IS ODD :: " + no);
      } 
  }  
 }