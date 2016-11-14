import java.util.Scanner;

class CollegeCourse {
 
   String id;
   int hours;
   char grade;

  public void get(String a){
    id = a; 
  } 
  public void set(int a,char b){
    hours = a;  
    grade = b;
  }
}

class Student1 {

 public static void main(String args[]) {

   int h;
   String id;
   char g;
   int k;

   Scanner sc = new Scanner(System.in);

   CollegeCourse a[] = new CollegeCourse[2];

    for(int i=0;i<a.length;i++){
      a[i] = new CollegeCourse();
    } 

   for(int i=0;i<a.length;i++) {
    System.out.println(" ENTER ID :: ");
    id = sc.next();
    System.out.println(" ENTER HOURS :: ");
    h = sc.nextInt();
    System.out.println(" ENTER GRADE :: ");
    g = sc.next().charAt(0);
  
      a[i].get(id);
      a[i].set(h,g);
    }
  
  for(int i=0;i<a.length;i++){
    System.out.println("  " + a[i].id + "   " + a[i].hours + "   "  + a[i].grade );
  }
   
}
}