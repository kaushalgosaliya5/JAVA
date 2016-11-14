import java.io.*;
import java.net.*;
import java.util.Scanner;

class MsgTCPServer {

 public static void main(String args[]) throws Exception{

  Scanner sc = new Scanner(System.in);
   
  ServerSocket ss = new ServerSocket(1400);
  Socket s;

  DataInputStream dis = null;
  DataOutputStream dos = null;

  while(true) {

  s = ss.accept();
 
  dis = new DataInputStream(s.getInputStream());
  dos = new DataOutputStream(s.getOutputStream());
  
  String s1 = dis.readUTF();
  
  System.out.println("\nclient question is :: " + s1);

  System.out.print("client answer is   :: ");
  String s2 = sc.nextLine();

   dos.writeUTF(s2);   
   s.close();   
  }

 }
}