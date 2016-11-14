import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame1 extends JFrame implements ItemListener {

  Container con;
  JComboBox cb = new JComboBox(); 

  JFrame1(String s){
  
    super(s);

    con = getContentPane();
    con.setLayout(new FlowLayout());
  
  // in that program compile time arrar but that can run it
  
    cb.setEditable(true);
    cb.addItem("AHMEDABAD");
    cb.addItem("SURAT");     
    cb.addItem("RAJCOT");
    cb.addItem("GANDHINAGAR");
    cb.addItem("BARODA");

    cb.addItemListener(this);    
    con.add(cb);

    setSize(500,550);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
 
  public void itemStateChanged(ItemEvent ie){
      String s = (String)cb.getSelectedItem();
      System.out.println(s); 
  }
}

class JComboBoxDemo {
 
 public static void main(String args[]) {
 
     new JFrame1("COMBO_BOX");
 }
}
