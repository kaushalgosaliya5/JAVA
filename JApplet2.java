import javax.swing.*;
import java.awt.*;

/*
 <applet code="JApplet2" width=400 height=400>
 </applet>
*/

public class JApplet2 extends JApplet {

 Container con;
 JButton jb;
 JLabel jl;

 public void init(){
   con = getContentPane();

   jb = new JButton("CLICKE ME !!!");
   jl = new JLabel(" WELCOME TO JAPPLET !!!!");

   FlowLayout l1 = new FlowLayout(FlowLayout.LEFT);   // LEFT,RIGHT,CENTER
   con.setLayout(l1);

   con.add(jb);  
   con.add(jl);
 }

}