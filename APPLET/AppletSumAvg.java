import java.applet.Applet;
import java.awt.Graphics;

public class AppletSumAvg extends Applet {

 int x,y,z,sum;
 String s1,s2;

 public void paint(Graphics g) {
  s1 = " SUM IS :: " + sum;
  g.drawString(s1,50,50);
  s2 = " AVERAGE IS :: " + (sum/3);
  g.drawString(s2,50,70); 
 }

 public void init() {
   x = Integer.parseInt(getParameter("a1"));
   y = Integer.parseInt(getParameter("a2"));
   z = Integer.parseInt(getParameter("a3"));
   sum = x+y+z;
 }
}