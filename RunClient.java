import java.io.*;
import java.net.*;
import java.util.Scanner;


class RunClient {

  public static void main(String args[]) throws Exception {

   Socket s;
  
   DataInputStream dis = null;
   DataOutputStream dos = null;

   Scanner sc = new Scanner(System.in);

   s = new Socket(args[0],Integer.parseInt(args[1])); 

   System.out.println("server Connect :: ");

   dis = new DataInputStream(s.getInputStream());
   dos = new DataOutputStream(s.getOutputStream());

   System.out.println("ENTER NUMBER :: ");
   int no = sc.nextInt();

   dos.writeInt(no);

   int ans = dis.readInt();
   System.out.println("factorial  of " + no + " is " + ans);
 
   System.out.println("disconnected server "); 

   s.close();
 }
}