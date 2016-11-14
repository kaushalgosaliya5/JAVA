import java.util.Scanner;

class String1 {

 public static void main (String args[]) {

  String s1 = "Ahmedabad";

  System.out.println(" YOUR CHARECTER 0th POSITION IS :: " + s1.charAt(0));

  System.out.println(" POSITION OF PATIQALAR CHARECTER 'A' IS :: " + s1.indexOf('A'));

  System.out.println(" POSITION OF LAST CHARECTER 'a' IS :: " + s1.lastIndexOf('a'));

  System.out.println(" UPPER CASE IS :: " + s1.toUpperCase());

  System.out.println(" LOWER CASE IS :: " + s1.toLowerCase());

  System.out.println(" IN (Boolean) STRING START'S WITH 'Ahm' is :: " + s1.startsWith("Ahm"));
 

 }
}