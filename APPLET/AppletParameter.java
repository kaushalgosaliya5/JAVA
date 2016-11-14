import java.applet.Applet;
import java.awt.Graphics;


public class AppletParameter extends Applet {
 
 String s = "";
 int x,y;

 public void paint(Graphics g) {
  g.drawString(s,x,y); 
 }
 
 public void init() {
  s = getParameter("str");
  x = Integer.parseInt(getParameter("xc"));
  y = Integer.parseInt(getParameter("yc"));  
 }
}