import java.util.Scanner;

class CollegeCourse {
 
   String id = " Enter id for Student #s :: ";
   String course = " Enter course ID #n :: ";
   int hours;
   char grade;
}

class InputGrade {

 public static void main(String args[]) {

   int i,j;

   CollegeCourse a[][] = new CollegeCourse[5][10];

   Scanner sc = new Scanner(System.in);

    for(int i=0;i<a.length;i++){
     for(int j=0;j<a[i].length;j++)
      a[i] = new CollegeCourse[10];
    } 

   for(int i=0;i<a.length;i++){
     for(int j=0;j<a[i].length;j++){
        a[i][j].course.replace('n',(i+1));  
        a[i][j].id.replace('s',(j+1));
     }
   }

  
   
}
}