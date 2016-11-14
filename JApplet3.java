import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JApplet3" width=400 height=400>
</applet>
*/

public class JApplet3 extends JApplet implements ActionListener {

 Container con;
 JButton jb;
 JLabel  jl;
  
 public void init(){

 con = getContentPane();
 jb = new JButton("click me !!!");
 jl = new JLabel(" welcome to my new JApplet project !!!");

 jb.addActionListener(this);
// con.setLayout(new FlowLayout());

 con.add(jl);
 con.add(jb,"North");
 }
 
 public void actionPerformed(ActionEvent ae){
   jb.setVisible(false);
   jl.setText("BUTTON CLICKED");
   con.remove(jb);
 }
}