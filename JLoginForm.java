import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ActionListener {

  Container con;
  JLabel jl1,jl2;
  JTextField jtf; 
  JPasswordField jpf;
  JButton jb1,jb2;

  JFrame1(String s){

    super(s);

   con = getContentPane();
   con.setLayout(new FlowLayout());

   jl1 = new JLabel("USER NAME :: ",10);
   jl2 = new JLabel("PASSWORD",10);
 
   jtf = new JTextField("user_name",10);
   jtf.selectAll();
   jpf = new JPasswordField(10);

   jb1 = new JButton("OK");
   jb1.addActionListener(this);
   jb2 = new JButton("CANCEL");
   jb2.addActionListener(this);

   con.add(jl1);
   con.add(jtf);
   con.add(jl2);
   con.add(jpf);
   con.add(jb1);
   con.add(jb2);
  }

  public void actionPerformed(ActionEvent ae) {
    String s = jtf.getText();
    String p = new String(jpf.getPassword());
    if(s.equals("KAUSHAL") && p.equals("12345")){
         new JFrame2("NEW WINDOW");
    } 
    else{
      jtf.setText("");
      jpf.setText("");
    }
  }
}

class JFrame2 extends JFrame {
 
  Container con;
  JLabel jl;
 
  JFrame2(String s){
    super(s); 

    con = getContentPane();
    con.setLayout(new FlowLayout());

    jl = new JLabel(" YOUR PASSWORD AND USERNAME IS WRITE");
    con.add(jl);

   setSize(1000,1050);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class JLoginForm {

  public static void main(String args[]){

   JFrame1 jf1 = new JFrame1("Login Form");

   jf1.setSize(250,300); 
   jf1.setVisible(true);
   jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
 } 
}