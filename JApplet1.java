import javax.swing.*;
import java.awt.*;

/*
<applet code="JApplet1" width=400 height=400>
</applet>
*/

public class JApplet1 extends JApplet {

  Container con;
  JLabel jl;
//JButton jb;
 
  public void init(){
      con = getContentPane();
      jl = new JLabel("WELCOME TO THE WORLD OF JApplet ");    // insert a button to form
 //   jb = new JButton("click me");                           // insert a label to form  
      con.add(jl);
 //   con.add(jb);
  }

}