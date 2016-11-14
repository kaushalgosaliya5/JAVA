import javax.swing.JOptionPane;

class Array5 {

 public static void main(String args[]) {

  int i;
  int a[] = new int[5];


  for(i=0;i<a.length;i++){
     a[i] = Integer.parseInt(JOptionPane.showInputDialog(" ENTER VALUE " + (i+1) + " :: "));
  }

  for(i=(a.length-1);i>=0;i--){
    System.out.println(" " + a[i]);
  }
 

 }
}