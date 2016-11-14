import java.net.*;
import java.io.*;

class RunServer {

  public static void main(String args[]) throws Exception {

   ServerSocket ss;
   Socket s;

   DataInputStream dis = null;
   DataOutputStream dos = null;

   ss = new ServerSocket(Integer.parseInt(args[0]));
   
   while(true) {
      s = ss.accept();
    
      dis = new DataInputStream(s.getInputStream());
      dos = new DataOutputStream(s.getOutputStream());
    
      int no = dis.readInt();
    
      System.out.println("Data Receive :: " + no);
  
      int fact = 1;

      for(int i=1;i<=no;i++){
         fact*=i;
      } 
         
      dos.writeInt(fact);  
      s.close();
   }     
   
 }
}