import java.io.*;
import java.net.*;

class RadiousServer {

  public static void main(String args[]) {
  
   try {

      ServerSocket ss = new ServerSocket(1400);
      Socket s = ss.accept();
      
      DataOutputStream dos = new DataOutputStream(s.getOutputStream());
      DataInputStream dis = new DataInputStream(s.getInputStream());

      double n = dis.readDouble();
           
      dos.writeDouble(n*n*Math.PI);
    
      s.close();
   }
   catch(Exception e){
      System.out.println("Exception e");
   }
 }
}
