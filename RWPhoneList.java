import java.io.*;
import javax.swing.*;

class Phone implements Serializable {
  String name;
  double no;
 
  Phone(String name,double no){
    this.name = name;
    this.no = no;
  }

  public void display(){
    JOptionPane.showMessageDialog(null," name is :: " + name + "\n phone is :: " + no);
  }
}

class RWPhoneList {

  public static void main(String args[]) throws ClassNotFoundException,IOException,FileNotFoundException {

  
     ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone1.txt"));

      Phone p[] = new Phone[3];
      String name;
      double no;

      for(int i=0;i<p.length;i++){
          name = JOptionPane.showInputDialog(null," ENTER NAME :: ");
          no = Double.parseDouble(JOptionPane.showInputDialog(null,"ENTER NUMBER :: "));

          p[i] = new Phone(name,no);
          oos.writeObject(p[i]);     
      }

      oos.close();

     ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone1.txt"));
     
     Phone p1;

     for(int i=0;i<3;i++){
         p1 = (Phone)ois.readObject();
         p1.display();
     }  

     ois.close();
}
}











