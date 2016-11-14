import java.util.Scanner;

class Thread1 implements Runnable {
  int sum;
  public void run() {
    for(int i=1;i<=5;i++) {
        sum += i;
    }
  }
}

class Thread2 implements Runnable {
   int sum;
   public void run() {
   for(int i=6;i<=10;i++){
    sum += i;
   }
 }
}

class Thread3 implements Runnable { 
 int sum;
 public void run() {
  for(int i=11;i<=15;i++){
    sum += i;
   }
 }
}

class RunnableAvg {
 
  public static void main(String args[]) {

  Thread1 t1 = new Thread1();
  Thread2 t2 = new Thread2();
  Thread3 t3 = new Thread3();

  Thread txt1 = new Thread(t1);
  Thread txt2 = new Thread(t2);
  Thread txt3 = new Thread(t3);

  txt1.start();
  txt2.start();
  txt3.start();

  try {
  txt1.join();
  txt2.join();
  txt3.join(); 
  }
  catch(InterruptedException e){
  }

  int sum = t1.sum + t2.sum + t3.sum;

  System.out.println(" SUM IS :: " + sum);   
  System.out.println(" AVERAGE IS :: " + sum/15);
}
}