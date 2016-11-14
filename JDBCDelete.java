import java.sql.*;
import java.util.*;

class JDBCDelete {

 public static void main(String args[]) throws Exception {

  Connection con = null;
  Statement stmt;

  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con = DriverManager.getConnection("jdbc:odbc:Std"); // Std :: that is database connection time to                                                                 give a name
  stmt = con.createStatement();
  
  String sql = "delete from student where sage = 20";
  int a = stmt.executeUpdate(sql);  
 
  System.out.println("TOTAL " + a + " rows deleted");

  stmt.close();
  con.close();
  
 }
}