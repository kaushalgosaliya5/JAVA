package S;

import P.X;
import Q.Y;
import R.Z;

// COMPILE ::-  E:\JAVA\PACKAGE_2\S>CD..

// RUN ::- E:\JAVA\PACKAGE_2>javac S\PackDemo2.java

class PackDemo2 {
 
 public static void main(String args[]) {

  X x1 = new X();
  Y y1 = new Y();
  Z z1 = new Z();
 
  x1.display();
  y1.display();
  z1.display();
}
}