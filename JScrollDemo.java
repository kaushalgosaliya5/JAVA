import javax.swing.*;
import java.awt.*;

class JFrame1 extends JFrame {
 
  Container con;
  JPanel jp;
  JTextArea jta;
  JScrollPane jsp;

  JFrame1(String s){
    super(s);

    con = getContentPane();
    con.setLayout(new FlowLayout());
   
    jp = new JPanel();  
    jsp = new JScrollPane(jp,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
     
    jta = new JTextArea(20,40);   
    jsp.add(jta);
 
    jp.add(jta);
    con.add(jsp);
    
    setVisible(true);
    setSize(500,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class JScrollDemo {

  public static void main(String args[]){

    new JFrame1("JScrollPane");
  } 
}


