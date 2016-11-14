import java.io.*;
import java.util.*;

class FileStatistics {

 public static void main(String args[]) {
 
     File f1 = new File(args[0]);
   
     if(f1.exists()){
         if(f1.isFile()){
           System.out.println(" File name is :: " + f1.getName());
           System.out.println(" PARENT IS :: " + f1.getParent());
           System.out.println(" SIZE IS :: " + f1.length());
           Date d1 = new Date(f1.lastModified());
           System.out.println(" LAST MODIFICATION IS :: " + d1);
         }
         else if(f1.isDirectory()){
           System.out.println(" it is directory ");
         } 
         else{
           System.out.println(" it is not file or directory "); 
         }
     }
     else{
          System.out.println(" not exists ");
     }

}
}
