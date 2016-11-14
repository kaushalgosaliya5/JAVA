

class Thread1 extends Thread {

  public void run() {
   int i=1;

   while(true){
     System.out.println(" Thread 1 :: " + i); 
     i++;
   }
}
}

class Thread2 extends Thread {
  
  public void run() {
    int i=1;
    while(true) {
      System.out.println(" Thread 2 :: " + i);
      i++;
    }
  }
}

class ThreadPriority {

  public static void main(String args[]) {

   Thread1 t1 = new Thread1();
   Thread2 t2 = new Thread2();

   System.out.println(t1.getPriority());    // getPriority is 5  by default
   System.out.println(t2.getPriority());    

   t1.setPriority(Thread.MIN_PRIORITY);  // MIN_PRIORITY = 0   // VALUE IS '0' TO '10'
   t2.setPriority(Thread.MAX_PRIORITY);  // MAX_PRIORITY = 10 

   t1.start();
   t2.start();

  // 'ctrl + c' to stop on run time;
 }
}