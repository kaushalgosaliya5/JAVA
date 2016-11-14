import javax.swing.JOptionPane;

class Prime_Number {

 public static void main(String args[]) {

   int i,j;
   Integer a[] = new Integer[5];
   Boolean p = new Boolean(true);


   for(i=0;i<a.length;i++){
     a[i] = Integer.parseInt(JOptionPane.showInputDialog(null," ENTER VALUE " + (i+1) + " :: "));
   }
 
   for(i=0;i<a.length;i++){
    p = true;
     for(j=2;j<a[i];j++){
        if(a[i] % j == 0){
           p = false;
           break;
        }
     }
   
     if(p == true){
        System.out.println(" " + a[i]);
     }
   }


 }
}