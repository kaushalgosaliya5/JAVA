import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="JSum2" width=400 height=400>
</applet>
*/

public class JSum2 extends JApplet implements ActionListener {

 Container con;
 JButton jadd;
 JLabel jl1,jl2,jl3;
 JTextField jtf1,jtf2;

 public void init(){
    con = getContentPane();
    con.setLayout(new GridLayout(3,2));

    jl1 = new JLabel("NUMBER 1  :: ");
    jl2 = new JLabel("NUMBER 2  :: ");
    jl3 = new JLabel("ANSWER IS :: ");
    
    jtf1 = new JTextField("5",10);  //  5 is default value  and 10 is textbox size
    jtf2 = new JTextField("5",10);  //  5 is default value  and 10 is textbox size

    jadd = new JButton("ADD 2 NO :: ");
    jadd.addActionListener(this);

    con.add(jl1);
    con.add(jtf1);
    con.add(jl2); 
    con.add(jtf2);    
    con.add(jadd);
    con.add(jl3);
 }

 public void actionPerformed(ActionEvent ae){
    int n1 = Integer.parseInt(jtf1.getText());
    int n2 = Integer.parseInt(jtf2.getText());
  
    int ans = n1 + n2;

    jl3.setText(""+ans);  
 }
}
 