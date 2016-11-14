import java.io.File;

class FileModified {
 
  public static void main(String args[]) {

   File f1 = new File("e:/ADJAVA","File1.txt");
  
   if(f1.exists()) {
      long l1 = f1.lastModified();
      java.util.Date d1 = new java.util.Date(l1);
      System.out.println(" DATE IS :: " + d1);
   }
   else{
       System.out.println(" FILE IS NOT EXISTS");
   }
  
  }
} 





















