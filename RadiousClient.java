import java.io.*;
import java.net.*;

class RadiousClient {

  public static void main(String args[]) {
 
  try{
    Socket s = new Socket("localhost",1400);

    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("enter radious :: ");
    double p = sc.nextDouble();

    dos.writeDouble(p);
 
    double a = dis.readDouble();
    System.out.println("area of circle :: " + a);

    s.close(); 
   }
   catch(Exception e){
     System.out.println("Exception :: " + e );
   }
  }
}