import java.net.*;
import java.io.*;

class UDPFileServer {

 public static void main(String args[]) throws  Exception {
 
   DatagramSocket ds = null;
   DatagramPacket dpout = null,dpin = null;

   int port;

   InetAddress remote_host;
   ds = new DatagramSocket(1400);

   while(true) {

    byte inbuf[] = new byte[250];
    dpin = new DatagramPacket(inbuf,250);
    ds.receive(dpin); 

    String s = new String (dpin.getData());
    System.out.println("\nserver received file that content is :: \n" + s.trim());
  }
    
 }
}