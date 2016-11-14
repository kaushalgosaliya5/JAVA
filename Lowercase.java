import javax.swing.JOptionPane;

class Lowercase {

 public static void main(String args[]) {

  String s;
  Boolean chk = new Boolean(true);

  s = JOptionPane.showInputDialog(null," ENTER STRING :: ");
  
   for(int i=0;i<s.length();i++){
      if(!(Character.isLowerCase(s.charAt(i)))) {
        chk = false;
        break;  
     }
   }

  if(chk == true){
     System.out.println(" GIVEN STRING IS LOWERCASE :: " + s);
  }
  else{
     System.out.println(" GIVEN STRING IS NOT LOWERCASE :: " + s);
   }
  
 }
}