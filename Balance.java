import javax.swing.JOptionPane;
import java.util.Scanner;

class Balance {

 public static void main(String args[]) {

  int account,saving;
 
  Scanner sc = new Scanner(System.in);

  System.out.print(" ENTER ACCOUNT BALANCE :: ");
  account = sc.nextInt();

  System.out.print(" ENTER SAVING BALANCE :: ");
  saving = sc.nextInt();

  if(account < 10 && saving < 100){
    JOptionPane.showMessageDialog(null," BOTH ACCOUNT BALACE IS DEANGEROUSLY LOW ");
  }
  else if(account < 10){
    JOptionPane.showMessageDialog(null," Checking account balance is low");
  }
  else if(saving < 100){
    JOptionPane.showMessageDialog(null," Saving account balance is low");
  } 
  else{
    JOptionPane.showMessageDialog(null," BOTH ACCOUNT BALACE IS NOT LOW ");
  }

} 
}