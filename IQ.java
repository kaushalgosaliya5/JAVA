import java.util.Scanner;
import javax.swing.JOptionPane;


class IQ {
 
  public static void main(String args[]) {

  int iq;

  Scanner  sc = new Scanner(System.in);

  System.out.println(" ENTER YOUR IQ :: ");
  iq = sc.nextInt();

  if(iq < 0 || iq > 200) {
    JOptionPane.showMessageDialog(null," IQ VALUE IS WRONG");
  }
  else if (iq > 100) {
    JOptionPane.showMessageDialog(null," above average ");
  }
  else if(iq < 100){
    JOptionPane.showMessageDialog(null," below average ");
  }
  else{
    JOptionPane.showMessageDialog(null," average ");
  }  	
 


}
}

