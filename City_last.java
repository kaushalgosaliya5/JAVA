import java.util.Scanner;

class City_last {

 public static void main(String args[]) {

  String s1 = "Ahmedabad,Surat,Rajcot,Banglore";

  System.out.println(" LAST CITY IS :: " + s1.substring(s1.lastIndexOf(",")+1));

 }
}