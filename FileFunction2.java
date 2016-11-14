import java.io.File;


class FileFunction2 {

  public static void main(String args[]) {

  java.util.Scanner sc = new java.util.Scanner(System.in);
  String s1;
  
  System.out.println(" GIVE YOUR FILE NAME :: ");
  s1 = sc.next();

  File f1 = new File(s1);

  if(f1.exists()) {
 
    if(f1.isFile()) {
       System.out.println("FILE NAME IS :: " + f1.getName());
       System.out.println("FILE SIZE IS :: " + f1.length());
       String s2 = f1.getName();
       int l = s2.indexOf(".");
       System.out.println("FILE EXTENTION IS :: " + s2.substring(l));
    }
    else{
        System.out.println(" THIS IS A DIRECTORY ");
    }
  }
  else{
       System.out.println(" File is not exists ");
  }


 }
}