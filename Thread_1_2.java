import java.util.Scanner;

class Thread1 implements Runnable {

  public void run() {
  
   while(true){
   System.out.println(" THREAD 1 ");
   
   try{  
      Thread.sleep(1000);
   }
   catch(InterruptedException e) {
   } 
   }
  }
}

class Thread2 implements Runnable {

  public void run() {
   while(true) {
   System.out.println(" THREAD 2 ");
 
    try{
      Thread.sleep(3000);
    }
    catch(InterruptedException e){
    }
   }
  }
}

class Thread_1_2 {

 public static void main(String args[]) {

  Thread1 t1 = new Thread1();
  Thread2 t2 = new Thread2();
  
  Thread txt1 = new Thread(t1);
  Thread txt2 = new Thread(t2);

   txt1.start();
   txt2.start();  
}
}