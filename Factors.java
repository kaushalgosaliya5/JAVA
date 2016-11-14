import java.util.Scanner;

class Factors {

   public static void main(String args[]) {
    
    int i,no;

    Scanner sc = new Scanner(System.in);
 
    System.out.println(" FIND FACTORIAL TO ENTER ANY NUMBER :: ");
    no = sc.nextInt();

    i = 1;

    System.out.println(" FACTORS IS :: ");
 
    while(i < no)
    { 
      if(no % i == 0)
      { 
        System.out.println(i);
      } 
     i++; 
    }

  } 
 }