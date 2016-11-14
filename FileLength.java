import java.io.File;

class FileLength {

 public static void main(String args[]) {

  // to length of file
  File f1 = new File(args[0]);

  if(f1.exists()) {
  
     if(f1.isFile()){ 
           System.out.println(" YOUR FILE LENGTH IS :: " + f1.length());
     }
     else{
         System.out.println(" THIS IS A DIRECTORY ");
     }
  }
  else{
      System.out.println(" YOUR FILE IS NOT EXISTS ");
  }

 }
}