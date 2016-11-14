import java.io.File;

class FileSize {

  public static void main(String args[]) {

   File File_dname = new File(args[0]);
   java.util.Scanner sc = new java.util.Scanner(System.in);

   String  name[] = File_dname.list();

   for(int i=0;i<name.length;i++) {
      
         File f1 = new File(File_dname,name[i]);
         
         if(f1.isFile() && f1.length() <= 500) {
             System.out.println(f1.getName());
         }             
   }

  }
}

