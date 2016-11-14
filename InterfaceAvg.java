import java.util.Scanner;

interface Numbers {
  int Process(int x,int y);
}

class Sum implements Numbers {

  public int Process(int x,int y){
    return x+y;
  } 
}

class Average implements Numbers {

  public int Process(int x,int y){
     return (x+y/2);
  }
}

class InterfaceAvg {

  public static void main(String args[]) {
  
  Numbers n1 = new Sum();
  Numbers n2 = new Average();

  System.out.println(" SUM IS :: " + n1.Process(10,15));
  System.out.println(" AVERAGE IS :: " + n2.Process(10,20));  
}
}

