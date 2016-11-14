import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame {

  Container con;
  JLabel jl;

  JFrame1(String s){
    
    super(s);
  
    con = getContentPane();
    con.setLayout(new FlowLayout());
 
    jl = new JLabel("MY NAME IS KAUSHAL");
    jl.setOpaque(true);
    jl.setBackground(Color.red);
    con.add(jl);

    setSize(500,550);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class JLabelBackGround {

 public static void main(String arsg[]){
  
     new JFrame1("LABEL BACKGROUND COLOR ");

 }
}