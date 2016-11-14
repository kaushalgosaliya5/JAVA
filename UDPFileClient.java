import java.io.*;
import java.net.*;
import java.util.*;

class UDPFileClient {
 
 public static void main(String args[]) throws IOException {

   Scanner sc = new Scanner(System.in);

   DatagramSocket ds = null;
   DatagramPacket dpout = null, dpin = null;

   InputStream is;
   System.out.println("enter file name :: ");
   String fname = sc.next();
   File f1 = new File(fname);
   is = new FileInputStream(f1); 

   int port = 1400;

   InetAddress remote_host;
   ds = new DatagramSocket(1500);

   System.out.println("\nclient send file content :: ");
   
    byte outbuf[] = new byte[250];

    int c;
    String s="";

    while((c = is.read()) != -1){
        s = s + (char)c;
    }

    outbuf = s.getBytes();

    dpout = new DatagramPacket(outbuf,outbuf.length,InetAddress.getLocalHost(),port);
    ds.send(dpout);
 }
}