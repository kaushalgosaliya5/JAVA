import java.util.Scanner;

class Thread1 implements Runnable {

 public void run() {

   for(int i=1;i<=10;i++){
    System.out.println(" " + i);
   }
}
}

class Thread2 implements Runnable {

 public void run() {

   for(int i=11;i<=20;i++){
    System.out.println("  " + i);
   }
}
}

class Thread3 implements Runnable {
 
 public void run(){

   for(int i=21;i<=30;i++){
    System.out.println("   " + i);
   }
}
}

class ThreadDemo2 {
 
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
 
}
}