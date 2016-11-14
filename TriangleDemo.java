import java.util.Scanner;

class triangle {

  float height,base;

 triangle() {
   height = 10;
   base = 5;
 }

 triangle(float a) {
  height = base = a;
 }

 triangle(float height,float base) {
  this.height = height;   // sam name of reference variable and global variable
  this.base = base;  
 }
 
 void display() {
  System.out.println(" HEIGHT :: " + height);
  System.out.println(" BASE :: " + base);
 }

 double area() {
   return (0.5 * height * base);
 }
}

class TriangleDemo {

 public static void main(String args[]) {
   
   triangle t1 = new triangle();
   t1.display();
   System.out.println(" AREA IS :: " + t1.area());

   triangle t2 = new triangle(8);
   t2.display();
   System.out.println(" AREA IS :: " + t2.area());
 
   triangle t3 = new triangle(10,15);
   t3.display();
   System.out.println(" AREA IS :: " + t3.area());
 }
}




