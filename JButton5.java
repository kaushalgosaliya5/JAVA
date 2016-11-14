import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JButton5" width=400 height=400>
</applet>
*/

public class JButton5 extends JApplet {

 Container con;
 
 public void init(){

  con = getContentPane();

  con.setLayout(new BorderLayout(10,10));
 
  con.add(new JButton("N"),"North");
  con.add(new JButton("E"),"East");
  con.add(new JButton("W"),"West");
  con.add(new JButton("S"),"South");
  con.add(new JButton("C"));

 }
}