import java.util.Scanner;


class Thread1 extends Thread {

 public void run() {
 
   for(int i=0;i<=10;i++){
    System.out.println(" " + i);
   }
  }
}

class Thread2 extends Thread {

 public void run(){

  for(int i=11;i<=20;i++){
    System.out.println("  " + i);
  }
 }
}

class Thread3 extends Thread {
 
 public void run() {
  for(int i=21;i<=30;i++){
   System.out.println("   " + i);
  }
 }
}

class ThreadDemo1 {

 public static void main(String args[]) {

 Thread1 t1 = new Thread1();
 Thread2 t2 = new Thread2();
 Thread3 t3 = new Thread3();

  t1.start();  // start calling for run
  t2.start();
  t3.start();
}
}