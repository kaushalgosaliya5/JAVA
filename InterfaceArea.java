import java.util.Scanner;

interface Circle {
  double i = Math.PI;
  void area1(double radious);
}

interface Square {
  void area2(int length);
}

interface Rectangle {
   void area3(int l,int b);  
}

class Area implements Circle,Square,Rectangle {

  public void area1 (double r){
    System.out.println(" AREA OF CIRCLE IS :: " + (i*r*r));
  }
 
  public void area2 (int length) {
     System.out.println(" AREA OF SQUARE IS :: " + (4*length));
  }

  public void area3 (int l,int b) {
     System.out.println(" AREA OF RECTANGLE IS :: " + (l*b));
  }
}

class InterfaceArea {

 public static void main(String args[]) {

 Circle a = new Area();
 Square b = new Area();
 Rectangle c = new Area();

 a.area1(10.5);
 b.area2(10);
 c.area3(10,15); 

}
}