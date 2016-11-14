
class Thread1 extends Thread {

 int a,b,sum;
 
 Thread1(int a,int b){
    this.a = a;
    this.b = b;
 }
 public void run(){
   
  for(int i=a;i<=b;i++){
      sum += i;
  }
 }
}

class ThreadSum {

 public static void main(String args[]) {

  Thread1 t1 = new Thread1(1,10);
  Thread1 t2 = new Thread1(11,20);
  Thread1 t3 = new Thread1(21,30);

  t1.start();
  t2.start();
  t3.start();

  try {
  t1.join();
  t2.join();
  t3.join();
  }
  catch(InterruptedException e) {
  }

  System.out.println(" THREAD_1  t1 SUM IS :: " + t1.sum);
  System.out.println(" THREAD_1  t2 SUM IS :: " + t2.sum);
  System.out.println(" THREAD_1  t3 SUM IS :: " + t3.sum);

  int sum = t1.sum + t2.sum + t3.sum;

  System.out.println(" TOTAL IS :: " + sum);

 }
}