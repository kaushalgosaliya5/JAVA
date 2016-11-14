import java.io.*;

class ReadAndCopy {

 public static void main(String args[]) {

  InputStream is;
  OutputStream os;

  File f1 = new File("File1.txt");
  File f2 = new File("File2.txt");

  int c;

  try{
       is = new FileInputStream(f1);
       os = new FileOutputStream(f2,true);

      try{
           while((c = is.read()) != -1){
              os.write(c);
           }
      }
      catch(IOException e){
         System.out.println(" IOException");
      }
      finally{
                try{
                      is.close();
                      os.close();
                      System.out.println(" FILE_1 TO FILE_2 COPY");
                } 
                catch(IOException e){
                   System.out.println(" NOT CLOSE FILE");
                }
      }
  }
  catch(FileNotFoundException e){
     System.out.println(" FILE IS NOT FOUND ");
  }

 }
}