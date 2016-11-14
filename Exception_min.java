import java.util.Scanner;

class NegativeException extends Exception {
}

class Exception_min {

 public static void main(String args[]) {

  try {

  int min1 = Integer.parseInt(args[0]);
  int min2 = Integer.parseInt(args[1]);

  for(int i=0;i<args.length;i++){
    if(Integer.parseInt(args[i]) < 0){
    throw new NegativeException();
    }
  }

  for(int i=1;i<args.length;i++){
     
    if(Integer.parseInt(args[i]) < min1){
         min2 = min1;
         min1 = Integer.parseInt(args[i]);
     }
  }

  System.out.println(" MIN1 :: " + min1);  
  System.out.println(" MIN2 :: " + min2);
  }
  catch(NegativeException e){
    System.out.println(" ENTER VALUE NOT NEGATIVE ");
  }
  catch(ArrayIndexOutOfBoundsException e) {
    System.out.println(" PLEASE 2 OR MORE VALUE ENTER ");
  }
  catch(NumberFormatException e) {
    System.out.println(" PLEASE ENTER VALUE INTEGER FORMATE ");
  }

 
 }
}