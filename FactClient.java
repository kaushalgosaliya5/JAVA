import java.io.*;
import java.net.*;

class FactClient {

  public static void main(String args[]) {
 
  try{
    Socket s = new Socket("localhost",1400);

    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 
    dos.writeInt(5);

    int i = dis.readInt();
    System.out.println("Fectorial of number is :: " + i);

    s.close(); 
   }
   catch(Exception e){
     System.out.println("Exception :: " + e );
   }
  }
}