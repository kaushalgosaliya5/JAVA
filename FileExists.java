import java.io.File;

class FileExists {

 public static void main(String args[]) {

  // run time enter file name;
  File f1 = new File(args[0]);
  
  if(f1.exists()) {

     if(f1.isFile()) {
           System.out.println(" THIS IS A FILE ");
     }
     else if(f1.isDirectory()){
           System.out.println(" THIs IS A DIRECTORY ");
     }
     else{
           System.out.println(" THIS IS NOT A FILE OR DIRCTORY ");
     }
  } 
  else{
   System.out.println(" YOUR FILE IS NOT EXISTS ");
  }

 }
}