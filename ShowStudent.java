import java.util.Scanner;

class Student {

  int id;
  int hours;
  int points;

  Student(){
   id = 9999;
   points = 12;
   hours = 3;
  }

  void get(int a,int b,int c){
    id = a;
    hours = b;
    points = c;
  }

  void display(){
   System.out.println(" ID IS :: " + id);
   System.out.println(" POINTS :: " + points);
   System.out.println(" HOURS IS :: " + hours);
   } 
}

class ShowStudent {

  public static void main(String args[]) {

  int id,hours,points;
  Student a[] = new Student[2];

  for(int i=0;i<a.length;i++){
    a[i] = new Student();
  }  
  Scanner  sc = new Scanner(System.in);

  for(int i=0;i<a.length;i++){
   System.out.println(" ENTER ID :: ");
   id = sc.nextInt();

   System.out.println(" ENTER HOURS :: ");
   hours = sc.nextInt();

   System.out.println(" ENTER POINTS :: ");
   points = sc.nextInt();

    a[i].get(id,hours,points);
  }
  
  for(int i=0;i<a.length;i++){
    a[i].display();
  }

}
}