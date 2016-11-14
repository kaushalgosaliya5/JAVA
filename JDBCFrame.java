import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;


class JFrame1 extends JFrame implements ActionListener {
 
  Connection cn = null;
  Statement stmt;


  Container con;
  JLabel jl1,jl2,jl3;
  JTextField jtf1,jtf2,jtf3;
  JButton jb; 

  JFrame1(String s) {
   
   super(s);
   con = getContentPane();
   con.setLayout(new GridLayout(4,2));

   jl1 = new JLabel("ENTER ROLL NO :: ");
   jtf1 = new JTextField("0",10);
   jtf1.selectAll();

   jl2 = new JLabel("ENTER NAME :: ");
   jtf2 = new JTextField("Abc",10);
   jtf2.selectAll();

   jl3 = new JLabel("ENTER AGE :: ");
   jtf3 = new JTextField("0",10);
   jtf3.selectAll();

   jb = new JButton("INSERT DATA");
   jb.addActionListener(this);

    con.add(jl1);
    con.add(jtf1);
    con.add(jl2);
    con.add(jtf2);
    con.add(jl3);
    con.add(jtf3);
    con.add(jb);

    setSize(500,550);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
 
  public void actionPerformed(ActionEvent ae){

 try{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     cn = DriverManager.getConnection("jdbc:odbc:Std");
  
     int srno = Integer.parseInt(jtf1.getText());
     String sname = jtf2.getText();
     int sage = Integer.parseInt(jtf3.getText());

     stmt = cn.createStatement();
     String sql = "insert into student values ( " + srno + ",'" + sname + "'," + sage + ")";
 
     int a = stmt.executeUpdate(sql);

     System.out.println(" total " + a + " rows inserted");
  
     stmt.close();
     cn.close();
  }
  catch(Exception e){
    System.out.println("already row inserted");
  }
  
  }
}

class JDBCFrame {
  public static void main(String args[]){
          new JFrame1("Student Detail Insert");
  }  
}