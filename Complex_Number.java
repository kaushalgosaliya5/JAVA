import java.util.Scanner;

class Complex {

  int r,i;

  Complex(){
  }
  Complex(int real,int imaginary){
    r = real;
    i = imaginary;  
  }

  void add (Complex y){
     System.out.println((r+y.r) + "x + " + (i+y.i));
  }
  void sub(Complex y){
    System.out.println((r-y.r) + "x + " + (i-y.i));
  }
  void multi(Complex y){
    System.out.println((r*y.r) + "x + " + (i*y.i));
  }
}

class Complex_Number {

 public static void main(String args[]) {

  Complex c1 = new Complex(10,20);
  Complex c2 = new Complex(5,15);

  c1.add(c2);
  c1.sub(c2);
  c1.multi(c2);

 }
}