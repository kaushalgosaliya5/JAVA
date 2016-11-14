import java.io.*;
import java.net.*;

class ServerDemo {

  public static void main(String args[]) {
  
   try {

      ServerSocket ss = new ServerSocket(1400);
      Socket s = ss.accept();
      
      OutputStream os = s.getOutputStream();
      DataOutputStream dos = new DataOutputStream(os);


      dos.writeUTF("WELCOME TO JAVA");
    
      s.close();
   }
   catch(Exception e){
      System.out.println("Exception e");
   }
 }
}
