import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ActionListener {

  Container con;
  JPasswordField jpf;
 
  JFrame1(String s){

    super(s);

    con = getContentPane();
    con.setLayout(new FlowLayout());

    jpf = new JPasswordField(10);
    jpf.addActionListener(this);
    con.add(jpf);

    setSize(500,550);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }  

  public void actionPerformed(ActionEvent ae) {
     System.out.println(jpf.getPassword());        
  }
}

class JPasswordDemo {
 
  public static void main(String args[]) {

     new JFrame1("First Frame");

  }
}