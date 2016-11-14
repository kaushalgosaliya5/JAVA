import java.util.Scanner;

abstract class Shape {
   abstract void display();
   abstract double area();
}

class Rect extends Shape {
   
   double length,wedth;

   Rect() {
     length = wedth = 5;
   }
   Rect(double a) {
     length = wedth = a;
   }
   Rect(double a,double b) {
     length = a;
     wedth = b;
   }

   void display(){
    System.out.println(" LENGTH IS :: " + length);
    System.out.println(" WEDTH IS :: " + wedth);
   }

   double area() {
    return length*wedth;
   }
}

class Circle extends Shape {
  
   double r;

   Circle() {
     r = 5;
   }
   Circle(double a) {
     r = a;
   }
   
   void display(){
    System.out.println(" RADIOUS IS :: " + r);
   }
    
   double area() {
     return 3.14 * r * r;
   }
}

class Triangle extends Shape {
 
   double base,height;

   Triangle() {
     base = height = 5;
   }
   Triangle(double a) {
     base = height = a;
   }
   Triangle(double a,double b) {
     base = a;
     height = b;
   }
   

   void display() {
    System.out.println(" BASE IS ::  " + base);
    System.out.println(" HEIGHT IS :: " + height);
   }

   double area() {
    return 0.5 * base * height;
  }
}

class Abstract_shape {

 public static void main(String args[]) {

  Shape s[] = new Shape[3];

  s[0] = new Rect(10,15);
  s[1] = new Circle(10);
  s[2] = new Triangle(10,15);

  for(int i=0;i<s.length;i++){
   s[i].display();
   System.out.println(" AREA IS :: " + s[i].area());
  }

}
}





