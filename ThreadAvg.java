import java.util.Scanner;

class Thread1 extends Thread {
  int sum;
  public void run() {
    for(int i=1;i<=5;i++) {
        sum += i;
    }
  }
}

class Thread2 extends Thread {
   int sum;
   public void run() {
   for(int i=6;i<=10;i++){
    sum += i;
   }
 }
}

class Thread3 extends Thread { 
 int sum;
 public void run() {
  for(int i=11;i<=15;i++){
    sum += i;
   }
 }
}

class ThreadAvg {
 
  public static void main(String args[]) {

  Thread1 t1 = new Thread1();
  Thread2 t2 = new Thread2();
  Thread3 t3 = new Thread3();

  t1.start();
  t2.start();
  t3.start();

  try {
  t1.join();
  t2.join();
  t3.join(); 
  }
  catch(InterruptedException e){
  }

  int sum = t1.sum + t2.sum + t3.sum;

  System.out.println(sum);   

}
}