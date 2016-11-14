import java.net.*;

class IpAddress {

  public static void main(String args[]) throws UnknownHostException {

   InetAddress ip1 = InetAddress.getLocalHost();
   
    System.out.println("IP IS :: " + ip1.getHostAddress());
    System.out.println("ADDRESS IS :: " + ip1.getHostName()); 

    // if internate is connect that time this output generate athorwise not
   InetAddress ip[] = InetAddress.getAllByName("www.google.com");
    
    for(int i=0;i<ip.length;i++){
       System.out.println(ip[i].getHostName());
       System.out.println(ip[i].getHostAddress());
    } 
 }
}