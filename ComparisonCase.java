import java.util.Scanner;

class ComparisonCase {

 public static void main(String args[]) {

  String s1 = new String("kaushal gosaliya");
  String s2 = new String("Kaushal Gosaliya");

  System.out.println(" EQUALS :: " + s1.equals(s2));
  System.out.println(" EQUALS IGNORE CASE :: " + s1.equalsIgnoreCase(s2));

}
}