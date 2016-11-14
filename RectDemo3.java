import java.util.Scanner;

class Rect {
   int length,width;

 Rect() {
    length = width = 5;
 }

 Rect(int a) {
   length = width = a;
 }
  
 Rect(int length,int width) {
   this.length = length;
   this.width = width;
 }
 
 void display() {
  System.out.println("Length :: " + length); 
  System.out.println("Wedth :: " + width);
 }

 int area() {
  return (length * width);
 }
}

class RectDemo3 {

  public static void main(String args[]) {
 
  Rect r1 = new Rect();
  r1.display();
  System.out.println(" AREA IS :: " + r1.area());

  Rect r2 = new Rect(8);
  r2.display();
  System.out.println(" AREA IS :: " + r2.area());

  Rect r3 = new Rect(10,15);
  r3.display();
  System.out.println(" AREA IS :: " + r3.area());
 }
}
























