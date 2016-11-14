import java.util.Scanner;

class OddException extends Exception {
}

class Exception_even {
 
 public static void main(String args[]) {
 
  int even=0;

  try {

    for(int i=0;i<args.length;i++){
     if(Integer.parseInt(args[i]) % 2 == 0){
         even++;
     }
    }

   for(int i=0;i<args.length;i++){
     if(Integer.parseInt(args[i]) % 2 == 1){
         throw new OddException();
     }
   }

  }
  catch(OddException e){
     System.out.println(" NOT ENTER ODD NUMBER ");
  }
  catch(ArrayIndexOutOfBoundsException e){
     System.out.println(" PROPARLY VALUE ENTER");
  }
  catch(NumberFormatException e){
     System.out.println(" INPUT THE NUMBER IN INTEGER FORMATE");
  }
  finally{
    System.out.println(" TOTAL ODD IS :: " + (args.length-even));
  }

 }
}