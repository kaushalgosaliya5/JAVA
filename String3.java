import java.util.Scanner;

class String3 {

 public static void main(String args[]) {
   
   String s1 = "ahmedabad";
   String s2 = "ahmedabad";
  
  if(s1 == s2){     // S1 AND S2 REFERENCE IS SAME STRING
  System.out.println("PASING A REFERENCE :: TRUE ");
  }
  else {
  System.out.println(" FALSE ");
  }
 
  String s3 = "Ahmedabad";
  String s4 = s3;

  if(s3 == s4){     // S3 PASSING ADDRESS TO S4
  System.out.println(" TRUE ");
  }
  else {
  System.out.println(" FALSE ");
  }
 
  String s5 = new String("JAVA");
  String s6 = new String("JAVA");

  if(s5.equals(s6)) {        // in that placd s1 == s2 not use
    System.out.println(" TRUE ");
  }
  else {
    System.out.println(" FALSE ");
  }

  System.out.println(" WIDHOUT CASE COMPARITION FOR S1 AND S3 STRING :: " + s1.equalsIgnoreCase(s3));

  System.out.println(" PART(SUB) OF STRING :: " + s1.substring(3,6));
 
  // comparetion of to string

  int val = s1.compareTo(s2);

  if(val == 0) {
    System.out.println(" SAME STRING "); 
  }
  else if(val < 0) {
    System.out.println(" S1 STRING LENGTH IS MORE ");
  }
  else if(val > 0) {
    System.out.println(" S2 STRING LENGTH IS MORE ");
  }

 }
}