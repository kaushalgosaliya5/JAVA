import java.io.*;
import java.util.Scanner;

class RWEvenOdd {

 public static void main(String args[]) {
 
  try{  
      // writing a file
      FileOutputStream fos1 = new FileOutputStream("File1.txt");
      FileOutputStream fos2 = new FileOutputStream("File2.txt");
      DataOutputStream dos1 = new DataOutputStream(fos1);
      DataOutputStream dos2 = new DataOutputStream(fos2);

      Scanner sc = new Scanner(System.in);

      for(int i=1;i<=10;i++) {
         int no = sc.nextInt();
          
         if(no % 2 == 0){
              dos1.writeInt(no);
         }
         else{
              dos2.writeInt(no);    
         }          
      }

      fos1.close();
      fos2.close();
      dos1.close();
      dos2.close();


      // reading a file
      FileInputStream fis1 = new FileInputStream("File1.txt");
      DataInputStream dis1 = new DataInputStream(fis1);
      FileInputStream fis2 = new FileInputStream("File2.txt");
      DataInputStream dis2 = new DataInputStream(fis2);

      for(int i=1;i<=5;i++){
         int no = dis1.readInt();
         System.out.println(" " + no);
      }

      for(int i=1;i<=5;i++){
         int no = dis2.readInt();
         System.out.println(" " + no);
      }

      fis1.close();
      dis1.close();
      fis2.close();
      dis2.close();
  }
  catch(IOException e) {
      System.out.println(" IOException ");
  }

 }
}
