import javax.swing.JOptionPane;

class String_Reverse {

  public static void main(String args[]) {

    String a;  
    int i;
   
    a = JOptionPane.showInputDialog(null," ENTER YOUR NAME :: ");
  
    for(i=(a.length()-1);i>=0;i--){
       System.out.println("  " + a.charAt(i));
    }

 }
}