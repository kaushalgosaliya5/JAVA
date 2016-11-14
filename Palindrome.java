import java.util.Scanner;

class Palindrome {

  public static void main(String args[]) {

    int i,no,rno,ono,rem; // rno = reverce no  ono = original no

    Scanner sc = new Scanner(System.in); 

    System.out.println(" CHECK PALINDROME OR NOT TO ENTER ANY NUMBER :: ");
    no = sc.nextInt();

    ono = no;
    rno = 0;  

    while(no > 0)
    {
      rem = no % 10;
      no = no / 10;
      rno = rno * 10 + rem;
    }

    if(ono == rno) 
    {
      System.out.println(" YOUR NUMBER IS PALIN-DROME ");
    }
    else
    {
      System.out.println(" YOUR NUMBER IS NOT PALIN-DROME ");
    } 

  }
 }