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

class Rect_Array {
 
 public static void main(String args[]) {

  Rect r[] = new Rect[3];  // references variable to convert array

  r[0] = new Rect();
  r[1] = new Rect(8);
  r[2] = new Rect(10,12);

  for(int i=0;i<r.length;i++)
  {
    r[i].display();
  }
 
 } 
}