import java.util.Scanner;

class Admission {

 public static void main(String args[]) {

 int score;
 int grade;

  Scanner sc = new Scanner(System.in);

 System.out.println(" ENTER SCORE (0-100) :: ");
 score = sc.nextInt();  
 
 System.out.println(" ENTER GRADE POINT (0-4) :: ");
 grade = sc.nextInt();



 if(grade > 4 || grade < 0 || score < 0 || score > 100){
   System.out.println(" REJECT ");
 }
 else if(grade >= 3.0 && score >= 60){
   System.out.println(" ACCEPT ");
 }
 else if(grade < 3.0 && score >= 80){
   System.out.println(" ACCEPT ");
 }
 else{
   System.out.println(" REJECT ");
 }
 
}
}