import java.sql.*;

class JDBCStudent2 {

 public static void main(String args[]) throws Exception {

  Connection con=null;
  Statement stmt;
 
  ResultSet rs;
 
  java.util.Scanner sc = new java.util.Scanner(System.in);
  System.out.println("enter student name :: ");
  String s = sc.next();
 

 try{  
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con = DriverManager.getConnection("jdbc:odbc:Std");

  
  stmt = con.createStatement();
  rs = stmt.executeQuery("select * from student where sname = '" +s+ "'");
   
  while(rs.next()){
    System.out.println(rs.getInt("sid") + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
  }
  
  rs.close();
  stmt.close();
  con.close();
 }
 catch(ClassNotFoundException e){
   System.out.println(e.getMessage());
 }
 catch(SQLException e){
   System.out.println(e.getMessage());
 }
 catch(Exception e){
   System.out.println(e.getMessage());
 }
 
 
 }
}