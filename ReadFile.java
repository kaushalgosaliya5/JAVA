import java.io.*;
import java.util.Scanner;

class ReadFile {

  public static void main(String args[]) {

   InputStream is;
   OutputStream os;
 
   File f1 = new File("File1.txt");
   os = System.out;
 
   int c;
 
   try{

       is = new FileInputStream("File1.txt");
       
       try{
            while((c = is.read()) != -1) {
               os.write(c);
            }
       }
       catch(IOException e){
          System.out.println(" ERROR ");
       } 
       finally{
              try{
                  is.close();
                  os.close();             
              }
              catch(IOException e){
                  System.out.println(" CLOSE ERROR ");
              }
      }
   }
   catch(FileNotFoundException e){
       System.out.println(" FILE NOT FOUND");
   }   
 }
}