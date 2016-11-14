import javax.swing.JOptionPane;

class JOptionPane_Interest {

  public static void main(String args[]) {

  String p1 = JOptionPane.showInputDialog(" ENTER PRINCIPAL AMOUNT :: ");
  String r1 = JOptionPane.showInputDialog(" ENTER RATE OF INTEREST :: ");
  String n1 = JOptionPane.showInputDialog(" ENTER NUMBER OF YEAR :: ");

  Float p = Float.parseFloat(p1);
  Double r = Double.parseDouble(r1);
  Float n = Float.parseFloat(n1);

  JOptionPane.showMessageDialog(null," INTEREST IS :: " + (p*r*n/100));
  
 }
}