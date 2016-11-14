import java.util.Scanner;

class JoinString {

 public static void main(String args[]) {

  StringBuffer s1 = new StringBuffer("Event Handlers is dedicated");
  StringBuffer s2 = new StringBuffer(" to making your event");
  StringBuffer s3 = new StringBuffer(" a most memorable one");  

  System.out.println(s1);
  System.out.println(s2);
  System.out.println(s3);
  System.out.println(s1.append(s2.append(s3)));


}
}