import java.util.Scanner;

class Rect {

   int length,wedth;

  Rect() {
    length = wedth = 5;
  }
  Rect(int x){
    length = wedth = x;
  }
  Rect(int x,int y){
    length = x;
     wedth = y;
  }

  void display(){
   System.out.println(" LENGTH IS :: " + length);
   System.out.println(" WEDTH IS :: " + wedth);
  }

  int area() {
    return (length*wedth);
  }
}

class Box extends Rect {

  int height;

  Box() {
  super();
  height = 5; 
  }
  Box(int x){
  super(x);
  height = x;
  }
  Box(int x,int y,int z){
  super(x,y);
  height = z;
  }

  void display() {
   super.display();
   System.out.println(" HEIGHT IS :: " + height);
  }

  int volume() {
    return  (area() * height);
  }
}

class Inheritence_rectangular {

  public static void main(String args[]) {

   Box b1 = new Box();
   Box b2 = new Box(10);
   Box b3 = new Box(10,20,30); 
   
   b1.display();
   b2.display();
   b3.display();

   System.out.println("B1 AREA IS :: " + b1.volume());
   System.out.println("B2 AREA IS :: " + b2.volume());
   System.out.println("B3 AREA IS :: " + b3.volume());

 }
} 