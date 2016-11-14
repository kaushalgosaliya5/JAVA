import java.io.*;
import java.util.Scanner;

class RWEvenOdd2 {
 
 public static void main(String args[]) {

 try{
      DataOutputStream dos1 = new DataOutputStream(new FileOutputStream("File1.txt"));
      DataOutputStream dos2 = new DataOutputStream(new FileOutputStream("File2.txt"));

      Scanner sc = new Scanner(System.in);
      System.out.print(" ENTER 10 NUMBER :: ");

      for(int i=0;i<10;i++) {
        int no = sc.nextInt();

         if(no % 2 == 0){
           dos1.writeInt(no);
         }
         else{
           dos2.writeInt(no);
         }
      }
     
     dos2.close();
     dos2.close();

     DataInputStream dis1 = new DataInputStream(new FileInputStream("File1.txt"));
     DataInputStream dis2 = new DataInputStream(new FileInputStream("File2.txt"));

     File f1 = new File("File1.txt");
     File f2 = new File("File2.txt");

     System.out.println(" FILE 1 ::");
     for(int i=0;i<f1.length()/4;i++) {
       System.out.println(" " + dis1.readInt());
     }

     System.out.println(" FILE 2 :: ");
     for(int i=0;i<f2.length()/4;i++){
       System.out.println(" " + dis2.readInt());
     }
     
     dis1.close();
     dis2.close();
  }
  catch(IOException e){
      System.out.println(" IOException ");
  }

 }
}