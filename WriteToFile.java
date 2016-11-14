import java.io.*;

class WriteToFile {

  public static void main(String args[]) {

    InputStream is;
    OutputStream os;

    File f1 = new File("File1.txt");

    int c;
    is = System.in;

    try{
       os = new FileOutputStream(f1);
  
       System.out.println(" TYPE SOME CHARACTER :: ");
    
       while((c = is.read()) != -1) {
          os.write(c);
       }   
    
       is.close();
       os.close();     
    }
    catch(IOException e){
         System.out.println(" EXCEPTION ");
    }
    
  } 
}