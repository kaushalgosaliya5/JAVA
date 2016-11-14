import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JChangFont" width=400 height=500>
</applet>
*/

public class JChangFont extends JApplet implements ActionListener {

  Container con;
  JButton jb;
  JLabel jl;
  Font fnt = new Font("Helvetica",Font.BOLD,25);

  public void init() {
    
   con = getContentPane();
  
   jb = new JButton("CLICK ME !!");
   jl = new JLabel("HELLO WORLD"); 

   jb.addActionListener(this);

   con.setLayout(new FlowLayout());
   con.add(jb);
   con.add(jl);
  }
  
  public void actionPerformed(ActionEvent ae){
    jl.setFont(fnt);
  }
}
