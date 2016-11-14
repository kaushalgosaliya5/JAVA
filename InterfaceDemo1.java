import java.util.Scanner;

interface I1 {
  double i=Math.PI;
  void f1();  
}

interface I2{
  void f2();
}

class C implements I1,I2 {
 
  public void f1() {
   System.out.println(" INTERFACE f1 :: " + i);
  }

  public void f2() {
   System.out.println(" INTERFACE f2 :: ");
  }
}


class InterfaceDemo1 {

 public static void main(String args[]) {

 I1 i = new C();
 I2 j = new C();

  i.f1(); 
  j.f2();
}
}