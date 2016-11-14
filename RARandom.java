import java.io.*;

class RARandom {

 public static void main(String args[]) {

 try{

   RandomAccessFile raf = new RandomAccessFile("File1.txt","rw");

   for(int i=0;i<10;i++){
         //raf.writeDouble(Math.random());
          raf.writeDouble((int)(Math.random()*6)+1);  // print 1 to 6
   }

   raf.seek(0);

   for(int i=0;i<10;i++){
      double no = raf.readDouble();
      System.out.println(" " + no); 
   }
 
   raf.close(); 
 }
 catch(IOException e){
   System.out.println(" IOException");
 }
}
}