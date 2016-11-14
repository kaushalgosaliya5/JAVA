import java.util.Scanner;

class TestMethords {
 
 public static void main(String args[]) {

 int a,b;

  a = 5;
  b = 10;
 
  displayIt(a,b);
  displayItTimesTwo(a,b);
  displayItPlusOneHundred(a,b);
 
 }

 static void displayIt(int a,int b) {
   System.out.println(" A is :: "  + a);
   System.out.println(" B is :: " + b);
 }

 static void displayItTimesTwo(int a,int b) {
   
   System.out.println(" A IS :: " + a);
   System.out.println(" B IS :: " + b);
 }

 static void displayItPlusOneHundred(int a,int b) {
   System.out.println(" A is :: " + (a+100));
   System.out.println(" B is :: " + (b+100));
  }

}