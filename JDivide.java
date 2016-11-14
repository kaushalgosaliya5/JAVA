import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JDivide" width=400 height=400>
</applet>
*/


public class JDivide extends JApplet implements ActionListener {

  Container con;
  JButton jb;
  JTextField jtf1,jtf2;
  JLabel jl1,jl2,jl3;
  public void init(){

   con = getContentPane();
   con.setLayout(new GridLayout(3,2));

   jl1 = new JLabel("enter first number :: ");  
   jtf1 = new JTextField("0",10);
   jl2 = new JLabel("enter second number :: ");  
   jtf2 = new JTextField("0",10);
   jl3 = new JLabel();

   jb = new JButton("divide");
   jb.addActionListener(this);
  
   jtf1.selectAll();
   jtf2.selectAll();   

   con.add(jl1);
   con.add(jtf1);
   con.add(jl2);
   con.add(jtf2);
   con.add(jb);
   con.add(jl3);
  }  

  public void actionPerformed(ActionEvent ae){

   int n1 = Integer.parseInt(jtf1.getText());
   int n2 = Integer.parseInt(jtf2.getText());

   if(n1 == 0 || n2 == 0){
      jl3.setText("ERROR");
   }
   else{
      jl3.setText((n1/n2) + "");
   }
 
  }
}