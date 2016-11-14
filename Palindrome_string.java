import java.util.Scanner;

class Palindrome_string {

 public static void main(String args[]) {

   int i,j;
   String s1,s2="";
   
   Scanner sc = new Scanner(System.in);

   System.out.println(" ENTER STRING :: ");
   s1 = sc.nextLine();
  
  for(i=(s1.length()-1);i>=0;i--){
     s2 = s2 + s1.charAt(i);
   }
  
  if(s1.equals(s2)) {
   System.out.println(" GIVEN STRING IS PALINDROME");
  }
  else {
   System.out.println(" GIVEN STRING IS NOT PALINDROME ");
  }

 }
} 