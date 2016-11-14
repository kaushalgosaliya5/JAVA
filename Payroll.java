import javax.swing.JOptionPane;


class Payroll {
 
 public static void main(String args[]) {


  double rate,hours,grosspay,netsal;

  rate = 10;
 
  hours = Double.parseDouble(JOptionPane.showInputDialog(null," ENTER NUMBER OF WORKING HOURS :: "));

  grosspay = hours * rate;   

  netsal = (grosspay - (grosspay*0.15));

  JOptionPane.showMessageDialog(null," GROSS PAY IS :: " + grosspay +
                                     "\n NET SALLARY IS :: " + netsal);

}
}