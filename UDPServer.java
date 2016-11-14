import java.net.*;
import java.io.*;

class UDPServer {

 public static void main(String args[]) throws  Exception {
 
   DatagramSocket ds = null;
   DatagramPacket dpout = null,dpin = null;

   int port;

   InetAddress remote_host;
   ds = new DatagramSocket(1400);
  
   System.out.println("server program :: ");

   while(true){
    
    byte inbuf[] = new byte[250];
    dpin = new DatagramPacket(inbuf,250);
    ds.receive(dpin); 

    String s = new String (dpin.getData());
    System.out.println("server received :: \n" + s.trim());

   if(s.trim().equals("exit")) 
     break;

    remote_host = dpin.getAddress();
    port = dpin.getPort();

    byte outbuf[] = new byte[250];

    java.util.Scanner sc = new java.util.Scanner(System.in);

    String s1 = sc.nextLine();
    outbuf = s1.getBytes();

    dpout = new DatagramPacket(outbuf,outbuf.length,remote_host,port);
 
    ds.send(dpout);

    if(s1.trim().equals("exit"))
         break;
    
  }
 }
}