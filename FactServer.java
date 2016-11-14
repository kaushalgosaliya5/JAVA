import java.io.*;
import java.net.*;

class FactServer {

  public static void main(String args[]) {
  
   try {

      ServerSocket ss = new ServerSocket(1400);
      Socket s = ss.accept();
      
      DataOutputStream dos = new DataOutputStream(s.getOutputStream());
      DataInputStream dis = new DataInputStream(s.getInputStream());

      int n1 = dis.readInt();
      int num=1;

      for(int i=1;i<=n1;i++){
          num = i * num;
      }
           
      dos.writeInt(num);
    
      s.close();
   }
   catch(Exception e){
      System.out.println("Exception e");
   }
 }
}
