import java.util.Scanner;

interface I1 {
  double i = Math.PI;
  void f1();
}

interface I2 extends I1 {   // inherit inteface to interface
  void f2();
}

class C implements I2 {

 public void f1(){
  System.out.println(" INTER FACE F1 :: " + i);
 }

 public void f2(){
   System.out.println(" INTER FACE F2");
 }
}

class InterfaceDemo2 {

 public static void main(String args[]){

   I1  i = new C();
   I2  j = new C(); 

      i.f1();
      j.f2();

}
}

