import java.util.Scanner;

class Mycollection {

 static int add(int a,int b,int c) {
    return (a+b+c);
 }
 
 static double add(double a,double b,double c) {
    return (a+b+c);
 }

 static int max(int a,int b) {
   return ((a>b) ? a : b);
 }
 
 static double max(double a,double b) {
   return ((a>b) ? a : b);
 }

}

class Add_Max {
  
 public static void main(String args[]) {

  int a=10, b=20, c=30;
  double p=5.5, q=15.5, r=25.5;

  System.out.println(" INTEGER SUM :: " + Mycollection.add(a,b,c));
  System.out.println(" FLOAT SUM :: " + Mycollection.add(p,q,r));
  System.out.println(" INTEGER MAX :: " + Mycollection.max(a,b));
  System.out.println(" FLOAT MAX :: " + Mycollection.max(p,q));
 
 }
}