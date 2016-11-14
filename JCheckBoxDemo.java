import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ItemListener {

  Container con;
  JCheckBox jcb;

  JFrame1(String s){
    super(s);

    con = getContentPane();
    con.setLayout(new FlowLayout());
   
    jcb = new JCheckBox("RED");
    jcb.addItemListener(this);

    con.add(jcb);
  }  

  public void itemStateChanged(ItemEvent ie){
      con.setBackground(Color.red);
  }
}

class JCheckBoxDemo {

  public static void main(String args[]) {

   JFrame1 jf = new JFrame1("CHECK BOX");
 

    jf.setSize(500,550);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}