import java.io.File;


class FileFunction {

  public static void main(String args[]) {
   
   File f1 = new File(args[0]);

   if(f1.exists()){
           
       System.out.println(" File NAME is " + f1.getName()); 
       System.out.println(" File PATH is :: " + f1.getPath());
       System.out.println(" File PARENT is :: " + f1.getParent());
        
       if(f1.isFile()) {
           System.out.println(" File LENGTH is :: " + f1.length());   // count by bit
       }
       else{
          System.out.println(" THIS IS A DIRECTORY");
       }
   }
   else {
        System.out.println(" YOUR FILE IS NOT EXISTS ");
   }

  }
}