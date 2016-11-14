import java.io.*;

class IOStream {

  public static void main(String args[]){
 
   InputStream is;
   OutputStream os;

   is = System.in;       // KEY-BOARD
   os = System.out;      // MONITER 

   int i;
   
   try{  
          while((i = is.read()) != -1){
            os.write(i);
          }   

          is.close();
          os.close();
    }
    catch(IOException e){
        System.out.println(" EXCEPTION ");
    }
 }
}