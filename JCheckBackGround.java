import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ItemListener {

 Container con; 
 JCheckBox cb1,cb2,cb3;

 JFrame1(String s){
    
   super(s);

   con = getContentPane();
   con.setLayout(new FlowLayout());

   cb1 = new JCheckBox("RED");
   cb1.addItemListener(this);
   cb2 = new JCheckBox("GREEN");
   cb2.addItemListener(this);
   cb3 = new JCheckBox("BLUE");
   cb3.addItemListener(this);

   con.add(cb1);
   con.add(cb2);
   con.add(cb3);

   setSize(500,550);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public void itemStateChanged(ItemEvent ie){
  
    int r = (cb1.isSelected() ? 255 : 0);
    int g = (cb2.isSelected() ? 255 : 0);
    int b = (cb3.isSelected() ? 255 : 0);

    con.setBackground(new Color(r,g,b));
 }
}

class JCheckBackGround {
  
 public static void main(String args[]) {

   new JFrame1("CHECK_BOX BACK_COLOR");

 }
}