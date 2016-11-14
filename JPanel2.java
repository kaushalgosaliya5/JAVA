import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JPanel2" width=400 height=400>
</applet>
*/

public class JPanel2 extends JApplet implements ActionListener {

  Container con;
  JLabel jl1,jl2,jl3;
  JButton jadd;
  JTextField jtf1,jtf2;
  JPanel jp1,jp2;

  public void init() {

   con = getContentPane();
   con.setLayout(new GridLayout(1,2));
  
   jl1 = new JLabel("NUM1 :: ");
   jl2 = new JLabel("NUM2 :: ");
   jl3 = new JLabel("ANSWER IS :: ");

   jtf1 = new JTextField("5",10);
  // jtf1.requestFocus();
   jtf2 = new JTextField("6",10);

   jadd = new JButton("ADD 2 NO :: ");
   jadd.addActionListener(this);      

   jp1 = new JPanel();
   jp1.setLayout(new GridLayout(2,2));
   jp1.add(jl1);
   jp1.add(jtf1);
   jp1.add(jl2);
   jp1.add(jtf2);

   jp2 = new JPanel();
   jp2.setLayout(new GridLayout(2,1));
   jp2.add(jadd);   
   jp2.add(jl3);

   con.add(jp1);
   con.add(jp2);
  }

  public void actionPerformed(ActionEvent ae){

   int n1 = Integer.parseInt(jtf1.getText());
   int n2 = Integer.parseInt(jtf2.getText());

   int ans = n1 + n2;
 
   jl3.setText(" " + ans);
  }
}