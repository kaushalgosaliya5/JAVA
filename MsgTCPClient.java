import java.io.*;
import java.net.*;
import java.util.Scanner;

class MsgTCPClient {

  public static void main(String args[]) throws Exception {
  
  DataInputStream dis=null;  
  DataOutputStream dos=null;
  Socket s; 

  Scanner sc = new Scanner(System.in);
  
  while(true){

  s = new Socket("localhost",1400);
  
   dis = new DataInputStream(s.getInputStream());
   dos = new DataOutputStream(s.getOutputStream());
    
   System.out.print("\nenter question :: ");
   String s1 = sc.nextLine();

   dos.writeUTF(s1);

   String s2 = dis.readUTF();
   System.out.println("your ans is    :: " + s2); 
    s.close();
  }
 }
}