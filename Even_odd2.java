import javax.swing.JOptionPane;

class Even_odd2 {

 public static void main(String args[]) {

  String s;

  s = JOptionPane.showInputDialog(null," ENTER NUMBER :: ");

  int x = Integer.parseInt(s);
 
  if(x % 2 == 0) {
    JOptionPane.showMessageDialog(null," GIVEN NUMBER IS EVEN :: " + x);
  }
  else{
    JOptionPane.showMessageDialog(null," GIVEN NUMBER IS ODD  :: " + x);
  }
  
 }
}
