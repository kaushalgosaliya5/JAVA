import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/*
<applet code="JEmployeeTital" width=400 height=400>
</applet>
*/

public class JEmployeeTital extends JApplet implements ActionListener {

  Container con;
  JLabel jl1,jl2,jl3;
  JButton jb;
  JTextField jtf1,jtf2;
  String s[][] = new String[3][2];

  public void init(){

   con = getContentPane();

   jl1 = new JLabel("ENTER NAME :: ");
   jl2 = new JLabel("DESIGNATION :: ");
   jtf1 = new JTextField(10);  
   jtf2 = new JTextField(10);
   jb = new JButton("CLICK ME !!!");
   jl3 = new JLabel("");

   jb.addActionListener(this);

   con.setLayout(new GridLayout(3,2));
   con.add(jl1);
   con.add(jtf1);
   con.add(jl2);
   con.add(jtf2);
   con.add(jb);
   con.add(jl3);

   s[0][0] = "kaushal";
   s[0][1] = "Manager";

   s[1][0] = "viral";
   s[1][1] = "clerk";

   s[2][0] = "shalin";
   s[2][1] = "general manager";
  }   
  
  public void actionPerformed(ActionEvent ae){

  int p=1;
  for(int i=0;i<s.length;i++){    
    if(s[i][0].equals(jtf1.getText())){
       jtf2.setText(s[i][1]);
       p=0;
    }
  }
  
  if(p == 1){
     jl3.setText("ERROR");
     jtf2.setText("");
  }

  }
}