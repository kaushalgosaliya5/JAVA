import java.io.*;
import java.util.*;
import javax.swing.*;

class Student implements Serializable {
 
 int id;
 String fname;
 String lname;

 Student(int id,String fname,String lname) {
   this.id = id;
   this.fname = fname;
   this.lname = lname;
 } 

 public void display(){

  System.out.println("YOUR ID IS :: " + id);
  System.out.println("YOUR FIRST NAME IS :: " + fname);
  System.out.println("YOUR LAST NAME IS :: " + lname);
 } 
}

class GraduAndUngraduate {

 public static void main(String args[]) throws FileNotFoundException,IOException,ClassNotFoundException {

  ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("Graduate.txt"));
  ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("Ungraduate.txt"));

  Scanner sc = new Scanner(System.in);

  int id;String fname;String lname;int gradu;

  Student s[] = new Student[3];

  for(int i=0;i<3;i++){

     System.out.println(" enter student id :: ");
     id = sc.nextInt();

     System.out.println("enter first name :: ");
     fname = sc.next();
    
     System.out.println("enter last name :: ");
     lname = sc.next();

     gradu = JOptionPane.showConfirmDialog(null,"YOU ARE GRADUATE OR NOT","GRADUATE FUNCTIONALITY",JOptionPane.YES_NO_OPTION);

     s[i] = new Student(id,fname,lname);
         
     if(gradu == JOptionPane.YES_OPTION){
         oos1.writeObject(s[i]);  
     }
     else{
         oos2.writeObject(s[i]); 
     }
  }
 }
}



