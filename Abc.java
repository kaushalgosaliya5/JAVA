import java.sql.*;

class Abc {
 
 public static void main(String args[]) throws Exception,ClassNotFoundException{

  Connection con = null;
  Statement stmt;

  ResultSet rs;

  java.util.Scanner sc = new java.util.Scanner(System.in);
  String s = sc.next();

  Class.forName("Sun:Jdbc:Odbc:JdbcOdbcDriver");
  con=DriverManager.getConnection("Jdbc:Odbc:Std12");

  stmt = con.createStatement();
  rs = stmt.executeQuery("select * from Student where sname = 'kuashal'");

  System.out.println(" " + rs.getInt(1) + "  " + rs.getString(2));

  rs.close();
  stmt.close();
  con.close();
 }
}