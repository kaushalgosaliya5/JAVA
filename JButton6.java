import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JButton6" width=600 height=400>
</applet>
*/

public class JButton6 extends JApplet {

 Container con;
 
 public void init(){

  con = getContentPane();
  con.setLayout(new GridLayout(2,3,10,20));

  for(int i=1;i<=6;i++){
   con.add(new JButton("Button : " + i));
  }
  
 }
 
}