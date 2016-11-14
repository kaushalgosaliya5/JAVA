import javax.swing.JOptionPane;


class CountLetters {

 public static void main(String args[]) {

  String s1 = "Event Handlers Incorporated,8900 U.S.Highway 14,Crystal Lake,IL 60014";  
  String s2 = JOptionPane.showInputDialog(null," ENTER STRING :: ");
  int cnt1=0,cnt2=0;
 
  for(int i=0;i<s1.length();i++){
     
    if(Character.isLetter(s1.charAt(i))) {
     cnt1++;
    }
  }

 
  for(int i=0;i<s2.length();i++){
     
    if(Character.isLetter(s2.charAt(i))) {
     cnt2++;
    }
  }


  System.out.println(" S1 :: " + cnt1);
  System.out.println(" S2 :: " + cnt2);

}
}