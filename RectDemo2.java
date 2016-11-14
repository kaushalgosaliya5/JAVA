import java.util.Scanner;

class Rect {
 int length,wedth;

 void display() {

   System.out.println(" LENGTH IS :: " + length);
   System.out.println(" WEDTH IS :: " + wedth);

 }
}

class RectDemo2 {
  
  public static void main(String args[]) {
    
   Rect r1 = new Rect();

   r1.length = 15;
   r1.wedth = 12;

   r1.display();

   Rect r2 = new Rect();

   r2.length = 10;
   r2.wedth = 8;
  
   r2.display();
 }
}