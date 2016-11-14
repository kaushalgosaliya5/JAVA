import java.io.*;

class FileStatistics2 {
  public static void main(String args[]) {

  InputStream is;
  OutputStream os;

  is = System.in;
  File f1 = new File("quote.txt");

  int c;

  try{
    os = new FileOutputStream(f1);
    
    while((c = is.read()) != -1){
        os.write(c);
    }
    
    is.close();
    os.close();    
  }
  catch(IOException e){
    System.out.println(" io exception ");
  }  
  

  File f2 = new File("quote.doc");
  c=0;
  
  try{

   is = new FileInputStream("quote.txt");
   os = new FileOutputStream("quote.doc");
 
   while((c = is.read()) != -1){
        os.write(c);
   }

   
    is.close();
    os.close();
  }
  catch(FileNotFoundException e){
      System.out.println(" file not found ");
  }
  catch(IOException e){
      System.out.println(" io exception ");
  }    
  
  System.out.println(" FILE 1 SIZE IS :: " + f1.length());
  System.out.println(" FILE 2 SIZE IS :: " + f2.length());
  System.out.println(" RATIO OF SIZE BOTH ON :: " + (f2.length() - f1.length()));
  
}
}