import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ItemListener {

  Container con;
  JRadioButton rb1,rb2,rb3;
  ButtonGroup bg;  
  JFrame1(String s){
   
   super(s);

   con = getContentPane();
   con.setLayout(new FlowLayout());
   
   bg = new ButtonGroup();
   rb1 = new JRadioButton("RED");
   rb1.addItemListener(this);
   rb2 = new JRadioButton("GREEN");
   rb2.addItemListener(this);
   rb3 = new JRadioButton("BLUE");
   rb3.addItemListener(this);

   bg.add(rb1);
   bg.add(rb2);
   bg.add(rb3);

   con.add(rb1);
   con.add(rb2);
   con.add(rb3);

   setSize(500,550);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void itemStateChanged(ItemEvent ie){
    int r = (rb1.isSelected() ? 255 : 0);
    int g = (rb2.isSelected() ? 255 : 0);
    int b = (rb3.isSelected() ? 255 : 0);
 
    con.setBackground(new Color(r,g,b));
  } 
}

class JRadioBackGround {

  public static void main(String args[]) {

      new JFrame1("RADIO_BUTTON BACK_COLOR"); 

  }
}
