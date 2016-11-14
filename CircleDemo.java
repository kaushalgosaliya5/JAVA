import java.util.Scanner;

class circle {
  
 static final double PI = 3.14; 
 float r;

 circle() {
  r = 5;
 }

 circle(int a) {
   r = a;
 }

 void display() {
  System.out.println(" RADIOUS IS :: " + r);
 }

 double area() {
  return PI * r * r;  // 3.14 * r * r;
 }
}

class CircleDemo {

 public static void main(String args[]) {

  circle c1 = new circle();
  c1.display();
  System.out.println(" AREA IS :: " + c1.area());

  circle c2 = new circle(8);
  c2.display();
  System.out.println(" AREA IS :: " + c2.area());
 }
}














