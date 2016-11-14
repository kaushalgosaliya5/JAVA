import java.io.*;
import java.util.Scanner;

class RAReverse {

 public static void main(String args[]) {

 try{

     RandomAccessFile raf = new RandomAccessFile("File1.txt","rw");
     Scanner sc = new Scanner(System.in);
 
     for(int i=0;i<10;i++) {
       double no = sc.nextDouble();
       raf.writeDouble(no);     
     }
 
     for(int i=10;i>0;i--){
       raf.seek((i-1)*8);
       double no = raf.readDouble();
       System.out.print(" " + no); 
     }
  }
  catch(IOException e){
       System.out.println(" IOException ");
  }

 }
}