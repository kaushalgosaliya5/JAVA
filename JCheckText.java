import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ItemListener {
 
  Container con;
  JCheckBox cb1,cb2,cb3,cb4,cb5;
  JTextField jtf;

  JFrame1(String s){

    con = getContentPane();
    con.setLayout(new FlowLayout());
    
    cb1 = new JCheckBox("CRICKET"); 
    cb1.addItemListener(this);
    cb2 = new JCheckBox("FOOT-BALL");
    cb2.addItemListener(this);
    cb3 = new JCheckBox("WALLY-BALL");
    cb3.addItemListener(this); 
    cb4 = new JCheckBox("TABLE-TANISH");
    cb4.addItemListener(this); 
    cb5 = new JCheckBox("CHESH");
    cb5.addItemListener(this);
    
    jtf = new JTextField(40);    

    con.add(cb1);
    con.add(cb2);
    con.add(cb3);
    con.add(cb4);
    con.add(cb5);
    con.add(jtf);

    setVisible(true);
    setSize(500,550);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void itemStateChanged(ItemEvent ie){

    String s = "";
  
    if(cb1.isSelected())
         s = cb1.getText() + " ; ";
    if(cb2.isSelected()) 
         s = s + cb2.getText() + " ; ";    
    if(cb3.isSelected())
         s = s + cb3.getText() + " ; ";
    if(cb4.isSelected()) 
         s = s + cb4.getText() + " ; "; 
    if(cb5.isSelected())
         s = s + cb5.getText();

    jtf.setText(s);
  }
}

class JCheckText {

  public static void main(String args[]) {
      
      new JFrame1("CHECK_BOX TEXT_FIELD");
  } 
}