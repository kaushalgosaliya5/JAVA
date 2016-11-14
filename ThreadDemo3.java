

class Thread1 extends Thread {

 int a,b;
 
 Thread1(int a,int b){
    this.a = a;
    this.b = b;
 }
 public void run(){
   
  for(int i=a;i<=b;i++){
   System.out.println(" " + i);
 
   try{
   Thread.sleep(500);
   }
   catch(InterruptedException e){
   }

  }
 }
}

class ThreadDemo3 {

 public static void main(String args[]) {

  Thread1 t1 = new Thread1(1,10);
  Thread1 t2 = new Thread1(11,20);
  Thread1 t3 = new Thread1(21,30);

  t1.start();
  t2.start();
  t3.start();

 }
}