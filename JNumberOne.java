import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JNumberOne" width=400 height=500>
</applet>
*/

public class JNumberOne extends JApplet implements ActionListener {

  Container con;
  JButton jb;
  JLabel jl;
  Font fnt = new Font("Helvetica",Font.BOLD,15);
  public void init() {
    
   con = getContentPane();
  
   jb = new JButton("WHO'S NUMBER ONE !!");
   jl = new JLabel(); 

   jb.addActionListener(this);

   con.setLayout(new FlowLayout());
   jl.setFont(fnt);
   con.add(jb);
   con.add(jl);
  }
  
  public void actionPerformed(ActionEvent ae){

    jl.setText("MY FAVOURATE SPORTS TEAM IS :: INDIA "); 
  }
}
