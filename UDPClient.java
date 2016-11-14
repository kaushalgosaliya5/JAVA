import java.io.*;
import java.net.*;

class UDPClient {
 
 public static void main(String args[]) throws IOException {

   DatagramSocket ds = null;
   DatagramPacket dpout = null, dpin = null;
 
   int port = 1400;

   InetAddress remote_host;
   ds = new DatagramSocket(1500);

   System.out.println("client program :: ");
   
   while(true){

    byte outbuf[] = new byte[250];

    java.util.Scanner sc = new java.util.Scanner(System.in);

    String s1 = sc.nextLine();
    outbuf = s1.getBytes();

    dpout = new DatagramPacket(outbuf,outbuf.length,InetAddress.getLocalHost(),port);
    ds.send(dpout);


    if(s1.trim().equals("exit")) 
        break;

     byte inbuf[] = new byte[250];
     dpin = new DatagramPacket(inbuf,250);
 
     ds.receive(dpin);

     String s = new String(dpin.getData());

     System.out.println("client receive :: " + s.trim());

     if(s.trim().equals("exit"))
          break;

  }
 }
}