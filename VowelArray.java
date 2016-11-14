import javax.swing.JOptionPane;

class VowelArray {

 public static void main(String args[]) {

  String s = JOptionPane.showInputDialog(null," ENTER STRING :: ");
  
  char a[] = new char[10];
  int j=0;

  for(int i=0;i<s.length();i++){
     
    if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
       s.charAt(i) == 'i' || s.charAt(i) == 'o' ||         s.charAt(i) == 'u')
        {
          a[j] = s.charAt(i);
          j++;
       }
  }
  
  for(int i=0;i<j;i++){
   System.out.println("  " + a[i]);
  }

}
}