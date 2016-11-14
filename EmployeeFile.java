import java.io.*;
import java.util.*;

class Employee implements Serializable {

 int id;
 String name;
 double sal;

 Employee(int id,String name,double sal){
  this.id = id;
  this.name = name;
  this.sal = sal; 
 }

 public void display(){
   System.out.println(" ID IS :: " + id);
   System.out.println(" NAME IS :: " + name);
   System.out.println(" SALLARY IS :: " + sal);
 }
}
 
class EmployeeFile {

 public static void main(String args[]) {

  try{

   Scanner sc = new Scanner(System.in);
   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File1.txt"));

   Employee e[] = new Employee[3];   
   int id;
   String name;
   double sal; 

   for(int i=0;i<3;i++){
    System.out.print(" ENTER ID :: ");
    id = sc.nextInt();
    System.out.print(" ENTER NAME :: ");
    name = sc.next();
    System.out.print(" ENTER SALLARY :: ");
    sal = sc.nextDouble();

    e[i] = new Employee(id,name,sal);

    oos.writeObject(e[i]);
    
   }

   oos.close();
  
   ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File1.txt"));

   Employee e1;

   for(int i=0;i<3;i++){
      e1 = (Employee)ois.readObject();
      e1.display();
   }
  }
  catch(ClassNotFoundException e){
    System.out.println(" CLASS NOT FOUND Exception ");
  }
  catch(IOException e){
    System.out.println(" Exception ");
  }

 }
}



















