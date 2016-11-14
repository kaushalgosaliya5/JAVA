import java.util.Scanner;

class Mean {
  
  double avg;

  Mean(double a[]) {

   double sum=0;
  
   for(int i=0;i<a.length;i++){
      sum = sum + a[i];
   }
   avg = sum / a.length;
  }
   
  void display() {
   System.out.println(" MEAN IS :: " + avg);
  }

  double average(){
    return avg;
  }
}

class Standard extends Mean {

  double sd,sum=0,l;
 
  Standard(double a[]) {
   super(a);
   l = a.length;
   for(int i=0;i<a.length;i++){     
      sum = sum + Math.pow(a[i]-average(),2);
   }
  }  

  void display() {
   super.display();
   System.out.println(" Standard Devition IS :: " + Math.sqrt(sum / l));
  }
 
}

class Inheritence_sd {

 public static void main(String args[]) {

   double a[] = new double[8];

   Scanner sc = new Scanner(System.in);

   for(int i=0;i<a.length;i++){
      System.out.println(" ENTER VALUE " + (i+1) + " :: ");
      a[i] = sc.nextInt();
   }

   Standard s1 = new Standard(a);

   s1.display();
   
 }
}