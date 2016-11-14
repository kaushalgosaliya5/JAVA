import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JUpper" width=400 height=400>
</applet>
*/

public class JUpper extends JApplet implements ActionListener {

  Container con;
  JLabel jl1;
  JTextField jtf1;
 
  public void init() {

   con = getContentPane();
   con.setLayout(new FlowLayout()); 

   jl1 = new JLabel("Enter String :: ");
   jtf1 = new JTextField(10);
   jtf1.addActionListener(this);

   con.add(jl1);
   con.add(jtf1);
  }

  public void actionPerformed(ActionEvent ae) {
    jtf1.setText(jtf1.getText().toUpperCase());
  }
}