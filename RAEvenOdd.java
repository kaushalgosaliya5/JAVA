import java.io.*;
import java.util.Scanner; 

class RAEvenOdd {

 public static void main(String args[]) {

  try{
  	RandomAccessFile raf1 = new RandomAccessFile("File1.txt","rw");
  	RandomAccessFile raf2 = new RandomAccessFile("File2.txt","rw");

	Scanner sc = new Scanner(System.in);
        int a=0,b=0;

	 for(int i=0;i<10;i++){
        
          int no = sc.nextInt();
          
          if(no % 2 == 0){
              a++;
              raf1.writeInt(no);
          }
          else{
              b++;
              raf2.writeInt(no);
          }
         }   


         raf1.seek(0);
         raf2.seek(0);

      System.out.println(" FILE 1 :: ");
      for(int i=0;i<a;i++){
         int no = raf1.readInt();
         System.out.println(no);
      }

      System.out.println(" FILE 2 :: ");
      for(int i=0;i<b;i++){
         int no = raf2.readInt();
         System.out.println(no);
      }
   }
   catch(IOException e){
        System.out.println(" EXCEPTION ");
   }  
 }
}