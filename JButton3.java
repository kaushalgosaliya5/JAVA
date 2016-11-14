import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JButton3" width=400 height=400>
</applet>
*/

public class JButton3 extends JApplet implements ActionListener {

  Container con;
  JButton jr,jg,jb;

  public void init(){
   con = getContentPane();
   con.setLayout(new FlowLayout());

   jr = new JButton("RED");
   jr.addActionListener(this);
   jg = new JButton("GREEN");
   jg.addActionListener(this);
   jb = new JButton("blue");
   jb.addActionListener(this);
 
   con.add(jr);
   con.add(jg);
   con.add(jb);
  }

  public void actionPerformed(ActionEvent ae){
   Object o = ae.getSource();

   if(o==jr){
      con.setBackground(Color.red);
   }
   else if(o==jg){
      con.setBackground(Color.green);
   }
   else if(o==jb){
      con.setBackground(new Color(0,0,255));
   }
  }
}