import java.io.*;
import java.net.*;


class ClientDemo {

  public static void main(String args[]) {
 
  try{
    Socket s = new Socket("localhost",1400);

    InputStream is = s.getInputStream();
    DataInputStream dis = new DataInputStream(is);
 
    String msg = dis.readUTF();

    System.out.println(msg);

    s.close();
   }
   catch(Exception e){
     System.out.println("Exception :: " + e );
   }
  }
}