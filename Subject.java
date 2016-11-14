import java.util.Scanner;

class Subject {

  public static void main(String args[]) {

    int s1,s2,s3,per;

    Scanner sc = new Scanner(System.in);

    System.out.println(" ENTER FIRST SUBJECT MARKS :: ");
    s1 = sc.nextInt();

    System.out.println(" ENTER SECOND SUBJECT MARKS :: ");
    s2 = sc.nextInt();

    System.out.println(" ENTER THIRD SUBJECT MARKS :: ");
    s3 = sc.nextInt();

    per = (s1+s2+s3) / 3;

    if(per > 80)
    {
       System.out.println(" GRADE IS :: A ");
    }
    else if(per > 60)
    {
       System.out.println(" GRADE IS :: B ");
    }
    else if(per > 35) 
    {
       System.out.println(" GRADE IS :: C ");
    }
    else 
    {
       System.out.println(" GRADE IS :: F ");
    }
      
  }
 }