import java.util.Scanner;

class Commandline1 {

  public static void main(String args[]) {
    
    // java Commandline1 c c++ 

    System.out.println(" ARGUMENT 0th is :: " + args[0]);          
    System.out.println(" ARGUMENT 1th is :: " + args[1]);          
         
    for(int i=0;i<args.length;i++) {
     System.out.println(" ARGUMENT " + i + "th is :: " + args[i]);
    }

 }  
}