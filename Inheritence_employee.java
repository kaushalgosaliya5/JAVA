import java.util.Scanner;

class Employee {

  String name,designation;
  
  Employee() {
    name = "kaushal";
    designation = "manager";
  }
  Employee(String name) {
    this.name = name;
    designation = "operator";
  }
  Employee(String name,String designation) {
     this.name = name;
     this.designation = designation;
  }
  
  void display() {
    System.out.println(" NAME IS :: " + name);
    System.out.println(" DESIGNATION IS :: " + designation);
  }
}

class Detail extends Employee {

  int sallary;

  Detail() {
   super();
   sallary = 10000;
  }
  Detail(String name){
   super(name);
   sallary = 15000;
  }
  Detail(String name,String designation,int sallary){
   super(name,designation);
   this.sallary = sallary;
  }

  void display() {
   super.display();
   System.out.println(" SALLARY IS :: " + sallary);
  }
}

class Inheritence_employee {
 
  public static void main(String args[]) {

   Detail d1 = new Detail();    
   Detail d2 = new Detail("viral");
   Detail d3 = new Detail("shalin","salesman",5000);

   d1.display();
   d2.display();
   d3.display();
 }
}







