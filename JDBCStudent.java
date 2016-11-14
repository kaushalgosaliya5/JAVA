import java.sql.*;

class JDBCStudent {

 public static void main(String args[]) throws Exception {

  Connection con=null;
  Statement stmt;
 
  ResultSet rs;

 try{  
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con = DriverManager.getConnection("jdbc:odbc:Std");

  stmt = con.createStatement();
  rs = stmt.executeQuery("select * from student");
   
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