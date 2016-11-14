import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JMovingFrame" width=400 height=400>
</applet>
*/

public class JMovingFrame extends JApplet implements ActionListener {

  Container con;
  JLabel jl;
  JButton jb;
  JPanel jp1;

  public void init() {

   con = getContentPane();
   con.setLayout(new GridLayout(1,2));
  
   jl = new JLabel("MY NAME IS KAUSHAL");

   jb = new JButton("MOVING PANEL");
   jb.addActionListener(this);      

   jp1 = new JPanel();
   jp1.setLayout(new GridLayout(2,2));
   jp1.add(jl);
   jp1.add(jb);

   con.setLayout(new GridLayout(1,1));
   con.add(jp1);
  }

  public void actionPerformed(ActionEvent ae){   
   jl.setLocation(200,20);
  }
}