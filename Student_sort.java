import javax.swing.JOptionPane;

class Student {
 
  String name;
  int marks;
}

class Student_sort {

 public static void main(String args[]){

  int i,j;
  Student s1[] = new Student[3];
  Student tmp = new Student();

  for(i=0;i<s1.length;i++){
    s1[i] = new Student();
  }

  for(i=0;i<s1.length;i++){
    s1[i].name = JOptionPane.showInputDialog(null," ENTER NAME  :: ");
 
    s1[i].marks = Integer.parseInt(JOptionPane.showInputDialog(null," ENTER MARKS :: ")); 
  }

  for(i=0;i<s1.length-1;i++){
  
      for(j=0;j<s1.length-i-1;j++) {
     
       if(s1[j].marks > s1[j+1].marks){
          tmp = s1[j];
          s1[j] = s1[j+1];
          s1[j+1] = tmp;
       }
    }
   }

   System.out.println(" NAME     MARKS ");

   for(i=0;i<s1.length;i++) {
    System.out.println(s1[i].name + "    " + s1[i].marks);
   }

 }
}