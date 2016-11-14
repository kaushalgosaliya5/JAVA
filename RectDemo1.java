import java.util.Scanner;

class Rect {

 int length,width;

 Rect() {
  length = width = 5;
 }

 Rect(int a) {
   length = width = a;
 }

 Rect(int a,int b) {
   length = a;
   width = b;
 }

 void display() {
  System.out.println(" length :: " + length);
  System.out.println(" width :: " + width);  
 }
  
 int area() {
  return (length * width);
 }
}

class RectDemo1 {
 
 public static void main(String args[]) {

  Rect r1 = new Rect();
  r1.display();
  System.out.println(" AREA IS :: " + r1.area()); 

  r1 = new Rect(8);
  r1.display();
  System.out.println(" AREA IS :: " + r1.area()); 
 
  r1 = new Rect(10,12);
  r1.display();
  System.out.println(" AREA IS :: " + r1.area()); 
 } 
}