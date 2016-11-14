import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/*
<applet code="JDouble" width=400 height=400>
</applet>
*/


public class JDouble extends JApplet implements ActionListener {

  Container con;
  JButton jb1,jb2;
  JTextField jtf;
  JLabel jl;
  public void init(){

   con = getContentPane();
   con.setLayout(new GridLayout(2,2));
  
   jb1 = new JButton("click me !!!");
   jb1.addActionListener(this);
   jl = new JLabel("enter INTEGER VALUE :: ");
   jtf = new JTextField("0",10);
   jb2 = new JButton("Double me !!!");
   jb2.addActionListener(this);

   jb2.setVisible(false);
   jtf.setVisible(false);
   jl.setVisible(false);

   con.add(jb1);
   con.add(jb2);
   con.add(jl);
   con.add(jtf);
  }  

  public void actionPerformed(ActionEvent ae){

    jb2.setVisible(true);
    jl.setVisible(true);
    jtf.setVisible(true);

    String s = jtf.getText();
    double d = Double.parseDouble(s);
    jtf.setText(d + "");
    
  }
}