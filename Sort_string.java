import javax.swing.JOptionPane;

class Sort_string {

  public static void main(String args[]) {
 
  int i,j;
  String a[] = new String[5];
  String tmp;

  for(i=0;i<a.length;i++) {
   a[i] = JOptionPane.showInputDialog(null," ENTER NAME :: "); 
  }


  for(i=0;i<a.length-1;i++) {  
   for(j=0;j<a.length-i-1;j++) {
      if(a[j].compareTo(a[j+1]) > 0){
          tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
      }
    }
  }   

  for(i=0;i<a.length;i++){
   System.out.println("  " + a[i]);
  }
  
}
}