import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class JFrame1 extends JFrame implements ActionListener {

  Container con;
  JButton jb;
  JLabel jl1,jl2,jl3;
  JTextField jtf1,jtf2,jtf3;
 
  JFrame1(String s){
  
  con = getContentPane();
  con.setLayout(new FlowLayout());
  
   jl1 = new JLabel("RED");
   jl2 = new JLabel("GREEN");
   jl3 = new JLabel("BLUE");
 
   jtf1 = new JTextField("0",10);
   jtf1.selectAll();
   jtf2 = new JTextField("0",10);
   jtf2.selectAll();
   jtf3 = new JTextField("0",10);
   jtf3.selectAll();
  
   jb = new JButton("BACK COLOR");
   jb.addActionListener(this);
 
   con.add(jl1);
   con.add(jtf1);
   con.add(jl2);
   con.add(jtf2);
   con.add(jl3);
   con.add(jtf3);
   con.add(jb);

  
   setSize(500,550);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
 
  public void actionPerformed(ActionEvent ae){
   int r = Integer.parseInt(jtf1.getText());
   int g = Integer.parseInt(jtf2.getText());
   int b = Integer.parseInt(jtf3.getText());
   con.setBackground(new Color(r,g,b));
  }
}

class JBackColor {

 public static void main(String args[]) {
       
     new JFrame1("Back Gound");
 }
}