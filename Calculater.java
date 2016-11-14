import javax.swing.JOptionPane;

class Calculater {

  public static void main(String args[]) {

  int a = Integer.parseInt(JOptionPane.showInputDialog(null," ENTER FIRST VALUE :: "));
  int b = Integer.parseInt(JOptionPane.showInputDialog(null," ENTER SECOND VALUE :: "));
  

  int o = Integer.parseInt(JOptionPane.showInputDialog(null," 1. + \n 2. - \n 3. * \n 4. / \n 5.% "));

  switch(o){
     case 1 : System.out.println(" SUM IS :: " + (a+b)); break;
     case 2 : System.out.println(" MINUSH IS :: " + (a-b)); break;
     case 3 : System.out.println(" MULTIPLICATION IS :: " + (a*b)); break;
     case 4 : System.out.println(" DIVITION IS :: " + (a/b)); break;
     case 5 : System.out.println(" MODULO IS :: " + (a%b)); break;
     default :
          System.out.println(" PLEASE ENTER CORRECT OPERATION ");
   }

 }
} 