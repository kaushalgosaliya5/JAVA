import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JSwap" width=400 height=400>
</applet>
*/

public class JSwap extends JApplet implements ActionListener {

 Container con;
 JTextField jtf1,jtf2;
 JButton jb1;
 JLabel jl1,jl2;
 
 public void init() {

  con = getContentPane();
  con.setLayout(new GridLayout(3,2));
 
  jl1 = new JLabel("ENTER STRING 1 :: ");
  jl2 = new JLabel("ENTER STRING 2 :: ");

  jtf1 = new JTextField(10);
  jtf2 = new JTextField(10);

  jb1 = new JButton(" SWAP ");
  jb1.addActionListener(this);

  con.add(jl1);
  con.add(jtf1);
  con.add(jl2);
  con.add(jtf2);
  con.add(jb1);
 }
 
 public void actionPerformed(ActionEvent ae){
  
   String s = jtf1.getText();
   jtf1.setText(jtf2.getText());
   jtf2.setText(s);
 }
}