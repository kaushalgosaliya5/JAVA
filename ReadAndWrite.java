import java.io.*;

class ReadAndWrite {

  public static void main(String args[]) {
  
   InputStream is;
   OutputStream os;

   is = System.in;
   os = System.out;

   int i;

    try{  
        while((i = is.read()) != -1) {
           os.write(i);      
        }
    }
    catch(IOException e){
         System.out.println(" ERROR IO ");
    }
    finally{

        try{
            is.close();
            os.close();
        }
        catch(IOException e) {
           System.out.println(" not close ");
        }
    }

 }
}