import javax.swing.JOptionPane;

class JOptionPaneDemo1 {

 public static void main(String args[]) {

  JOptionPane.showMessageDialog(null," MESSAGE DISPLAYED ","TITAL OF MESSAGE",
                                  JOptionPane.INFORMATION_MESSAGE);   

  String s =  JOptionPane.showInputDialog(" WHAT IS YOUR NAME :: ");                                                           
  JOptionPane.showMessageDialog(null," WELCOME " + s);

 }
}