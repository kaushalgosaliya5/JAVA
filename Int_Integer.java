import java.util.Scanner;

class Int_integer {

 public static void main(String args[]) {

  Integer i = new Integer(10);
 
  int val = i.intValue();

  System.out.println(" " + i );

  String s1 = "12";
  String s2 = "56";

  Integer i1 = Integer.valueOf(s1);
  Integer i2 = Integer.valueOf(s2);

  int n1 = i1.intValue();
  int n2 = i2.intValue();

  System.out.println("   " + n1 + "   " + n2);  
  
 }
}