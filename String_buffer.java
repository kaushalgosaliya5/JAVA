import java.util.Scanner;

class String_buffer {

 public static void main(String args[]) {

  StringBuffer sb1 = new StringBuffer();                // by default space is 16 bit
  System.out.println(" CAPACITY :: " + sb1.capacity() + " LENGTH :: " + sb1.length());

  StringBuffer sb2 = new StringBuffer(25);              // 25 bit space reserve
  System.out.println(" CAPACITY :: " + sb2.capacity() + " LENGTH :: " + sb2.length());

  StringBuffer sb3 = new StringBuffer("JAVA");          // 16 + 4 extra bit (java,'4') reserve 
  System.out.println(" CAPACITY :: " + sb3.capacity() + " LENGTH :: " + sb3.length());

 }
} 
