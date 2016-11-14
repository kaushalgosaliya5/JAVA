import java.util.Scanner;
import javax.swing.JOptionPane;

class EmployeeIDArray {

 public static void main(String args[]) {

  int id[] = new int[3];
  String name[] = new String[3];

  Scanner sc = new Scanner(System.in);

  for(int i=0;i<3;i++){
    System.out.println(" ENTER ID :: ");
    id[i] = sc.nextInt();
    System.out.println(" ENTER NAME :: ");
    name[i] = sc.next();
  }  

 int i = Integer.parseInt(JOptionPane.showInputDialog(null," ENTER EMPLOYEE ID :: "));
 
 JOptionPane.showMessageDialog(null," LAST NAME IS :: " + name[i-1]);


}
}