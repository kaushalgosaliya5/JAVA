import java.util.Scanner;

class Shirt {
  int coller;
  int sleeve;
  String material = "cotton";
 
  Shirt(int a,int b){
    coller = a;
    sleeve = b;
  }

  void display(){
   System.out.println(" COLLER :: " + coller);
   System.out.println(" SLEEVE :: " + sleeve);
   System.out.println(" MATERIAL :: " + material);
  }
}

class TestShirt {

 public static void main(String args[]) {

  Shirt s1 = new Shirt(5,10);
  Shirt s2 = new Shirt(15,20);
  Shirt s3 = new Shirt(25,30);

  s1.display();
  s2.display();
  s3.display();
 }
}