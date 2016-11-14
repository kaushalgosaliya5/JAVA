import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame {
 
  Container con;
  JTextArea jta;

  JFrame1(String s){

    super(s);

    con = getContentPane();
    con.setLayout(new FlowLayout());
        
    jta = new JTextArea(20,30);    // (length,width) 
    con.add(jta);

    setSize(500,550);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class JTextAreaDemo {

  public static void main(String args[]) {
      
      new JFrame1("TEXT_AREA");
  } 
}