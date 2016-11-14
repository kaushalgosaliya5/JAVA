import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ItemListener {
 
  Container con;
  JCheckBox cb1,cb2,cb3,cb4;
  ButtonGroup bj1;
  JTextField jtf;

  JFrame1(String s){

    con = getContentPane();
    con.setLayout(new GridLayout(3,2));
    
    bj1 = new ButtonGroup();

    cb1 = new JCheckBox("HMO"); 
    cb1.addItemListener(this);
    cb2 = new JCheckBox("PPO");
    cb2.addItemListener(this);
  
    bj1.add(cb1);
    bj1.add(cb2);
   
    cb3 = new JCheckBox("DENTAL");
    cb3.addItemListener(this); 
    cb4 = new JCheckBox("VISION");
    cb4.addItemListener(this); 

    jtf = new JTextField(40);    

    con.add(cb1);
    con.add(cb2);
    con.add(cb3);
    con.add(cb4);
    con.add(jtf);    
    setVisible(true);
    setSize(500,550);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void itemStateChanged(ItemEvent ie){

    int i=0;
    String s="";    

    if(cb1.isSelected()){
        i = 200;s = cb1.getText();
    }     
    if(cb2.isSelected()){ 
         i = 600;s = cb2.getText();
    }
    if(cb3.isSelected())
         i = i + 75;
    if(cb4.isSelected()) 
         i = i + 20;

    jtf.setText(s + " :: " + i );
  }
}

class JInsurance {

  public static void main(String args[]) {
      
      new JFrame1("CHECK_BOX TEXT_FIELD");
  } 
}