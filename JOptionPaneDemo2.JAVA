import javax.swing.JOptionPane;

class JOptionPaneDemo2 {

 public static void main(String args[]) {
   
  String n1 = JOptionPane.showInputDialog(null," ENTER FIRST NUMBER :: ",JOptionPane.WARNING_MESSAGE);

  String n2 = JOptionPane.showInputDialog(" ENTER SECOND NUMBER :: ");

  int num1 = Integer.parseInt(n1);
  int num2 = Integer.parseInt(n2);

  JOptionPane.showMessageDialog(null," SUM IS :: " + (num1+num2));
  JOptionPane.showMessageDialog(null," CONCATINATION IS :: " + num1 + num2);

  int value = JOptionPane.showConfirmDialog(null," DO YOU WANT TO CONTINUE ? ","TITLE",
              JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
 
  if(value == JOptionPane.YES_OPTION)
  {
    JOptionPane.showMessageDialog(null," YES BUTTON PRESS ");
  }
  else if(value == JOptionPane.NO_OPTION)
  {
    JOptionPane.showMessageDialog(null," NO BUTTON PRESS ");
  }
  else if(value == JOptionPane.CANCEL_OPTION) 
  { 
    JOptionPane.showMessageDialog(null," CANCEL BUTTON PRESS ");
  }
  
 }
}