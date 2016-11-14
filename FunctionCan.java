import java.io.*;

class FunctionCan {
  
  public static void main(String args[]) {
 
   File f1 = new File(args[0]);
   
   if(f1.exists()) {
      if(f1.isFile()) {
      
             System.out.println(" YOUR FILE LENGTH IS :: " + f1.length());
             System.out.println(" READ MODE IS :: " + f1.canRead());  // only reading a file
             System.out.println(" WRITE MODE IS :: " + f1.canWrite());
            // only writing a file , can a modifing
      }
      else{
          System.out.println(" This is a directory ");
      }
   }
   else{
      System.out.println(" YOUR FILE IS NOT EXISTS ");
   }
  }
}