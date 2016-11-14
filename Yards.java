import javax.swing.JOptionPane;

class  Yards {

 public static void main(String args[]) {

  float length,wedth,yard,rupees;
  int doller,sent;

  length = Float.parseFloat(JOptionPane.showInputDialog(null," ENTER LENGTH IS :: "));
 
  wedth = Float.parseFloat(JOptionPane.showInputDialog(null," ENTER WEDTH IS :: "));
 
  yard = (length*wedth) / 9;

  rupees = yard * 100;

  doller = (int) rupees / 60;
  sent = (int)rupees % 60;
  
  JOptionPane.showMessageDialog(null," DOLLER IS :: " + doller + " SENT IS :: " + sent);
}
}
