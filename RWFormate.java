import java.io.*;
import java.util.Scanner;

class RWFormate {
  
  public static void main(String args[]) {
 
  try{
       // writing inside a file 

       FileOutputStream fos = new FileOutputStream("File1.txt");
       DataOutputStream dos = new DataOutputStream(fos);

       Scanner sc = new Scanner(System.in);
   
       for(int i=1;i<=10;i++) {
           int no = sc.nextInt();
           dos.writeInt(no);
       }

       fos.close();
       dos.close();

       // reading to a file 

       FileInputStream fis = new FileInputStream("File1.txt");
       DataInputStream dis = new DataInputStream(fis);

       for(int i=1;i<=10;i++){
           int no = dis.readInt();
           System.out.print(" " + no);
       }

       fis.close();
       dis.close();
   }
   catch(IOException e) {
        System.out.println(" IOEXCEPTION");
   } 

  }
}