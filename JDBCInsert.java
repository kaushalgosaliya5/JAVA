import java.sql.*;
import java.util.*;

class JDBCInsert {

 public static void main(String args[]) throws Exception {

  Connection con = null;
  Statement stmt;

  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con = DriverManager.getConnection("jdbc:odbc:Std"); // Std :: that is database connection time to                                                                 give a name
  stmt = con.createStatement();
  
  String sql = "insert into student values(8,'MINIR',20)";
  int a = stmt.executeUpdate(sql);  
 
  System.out.println("TOTAL " + a + " rows inserted");

  stmt.close();
  con.close();
  
 }
}