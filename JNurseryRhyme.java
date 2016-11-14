import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame{

  Container con;
  JTextArea jta;

  JFrame1(String s){
   super(s);

   con = getContentPane();

   jta = new JTextArea(15,20);
   con.add(jta); 
   
   jta.setText("Jonny Jonny yes pappa \nEating sugar no pappa \nOpen your mounth no ah ha ha");

   con.setLayout(new FlowLayout());
   con.add(jta);

   setSize(500,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}

class JNurseryRhyme {

 public static void main(String args[]) {

    new JFrame1("Narsory Rhyme");
 }
}