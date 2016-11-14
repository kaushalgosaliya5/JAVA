import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ActionListener {

  Container con;
  JLabel jl;
  JButton jb1,jb2,jb3,jb4;

  Font jf1 = new Font("Times New Roman",Font.BOLD,20);
  Font jf2 = new Font("Helvetica",Font.ITALIC,20);
  Font jf3 = new Font("Batang",Font.BOLD,30);
  Font jf4 = new Font("Bodoni MT Black",Font.ITALIC,30);
 
  JFrame1(String s){

    super(s);

    con = getContentPane();
    con.setLayout(new FlowLayout(FlowLayout.LEFT));
   
    jl = new JLabel("MY NAME IS KAUSHAL"); 

    jb1 = new JButton("TIMES NEW ROMAN !!!");
    jb1.addActionListener(this);

    jb2 = new JButton("HELVETICA !!!");
    jb2.addActionListener(this);
    
    jb3 = new JButton("BATANG !!!");
    jb3.addActionListener(this);

    jb4 = new JButton("BODONI MT BLACK !!!");
    jb4.addActionListener(this);

    con.add(jb1);
    con.add(jb2);   
    con.add(jb3);  
    con.add(jb4); 
    con.add(jl);
  }  

  public void actionPerformed(ActionEvent e) {

    Object source = e.getSource();

    if(source == jb1){
     jl.setFont(jf1);
    }
    if(source == jb2){
     jl.setFont(jf2);
    }
    if(source == jb3){
     jl.setFont(jf3);
    }
    if(source == jb4){
     jl.setFont(jf4);
    }
  }
}

class JFontFrame {
 
  public static void main(String args[]) {
  
    JFrame1 jf = new JFrame1("First Frame");
    jf.setSize(500,550);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}