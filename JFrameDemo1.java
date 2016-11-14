import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ActionListener {

  Container con;
  JLabel jl;
  JButton jb;
 
  JFrame1(String s){

    super(s);

    con = getContentPane();
    con.setLayout(new FlowLayout());
   
    jl = new JLabel("Label On Frame"); 
    con.add(jl);

    jb = new JButton("CLICK ME !!!");
    jb.addActionListener(this);
    con.add(jb);
  }  

  public void actionPerformed(ActionEvent ae) {
    jl.setText("BUTTON CLICKED");
    con.setBackground(Color.green);
  }
}

class JFrameDemo1 {
 
  public static void main(String args[]) {
  
    JFrame1 jf = new JFrame1("First Frame");
    jf.setSize(500,550);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}