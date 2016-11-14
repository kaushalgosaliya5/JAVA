import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;


class JFrame1 extends JFrame implements ActionListener {
 
  Connection cn = null;
  Statement stmt;
  ResultSet rs;

  Container con;
  JComboBox jcb;
  JTextField jtf;
  JTextArea jta;
  JButton jb; 

  JFrame1(String s) {
   
   super(s);
   con = getContentPane();
   con.setLayout(new FlowLayout(FlowLayout.LEFT));

   jcb = new JComboBox();
   jcb.addItem("sid");
   jcb.addItem("sname");
   jcb.addItem("sage");

   jtf = new JTextField(10);
   jtf.selectAll();
  
   jb = new JButton("SELECT DATA");
   jb.addActionListener(this);

   jta = new JTextArea(20,30);

    con.add(jcb);
    con.add(jtf);
    con.add(jb);
    con.add(jta);

    setSize(550,500);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
 
  public void actionPerformed(ActionEvent ae){

 try{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     cn = DriverManager.getConnection("jdbc:odbc:Std");
  
     String nm = (String)jcb.getSelectedItem();
     stmt = cn.createStatement();
             
     if(nm.equals("sid")) {
             rs = stmt.executeQuery("select * from student where sid = " + Integer.parseInt                                                                            (jtf.getText()));
     }
     else if(nm.equals("sname")){
             rs = stmt.executeQuery("select * from student where sname = '" + jtf.getText() +"'");      
     }
     else if(nm.equals("sage")){
             rs = stmt.executeQuery("select * from student where sage = " + Integer.parseInt(jtf.getText()));
     }
  
     jta.setText("");
     jta.setText(" ID   NAME   AGE \n");
     String s = "";

     while(rs.next()){
          s = jta.getText();
          jta.setText(s + rs.getInt(1) +"   " + rs.getString(2) + " " + rs.getInt(3) + "\n");
     }

     rs.close();  
     stmt.close();
     cn.close();
  }
  catch(Exception e){
    System.out.println("THIS ROW IS NOT IN DATABASE");
  }
  
  }
}

class JDBCDetail {
  public static void main(String args[]){
          new JFrame1("Student Detail Show");
  }  
}