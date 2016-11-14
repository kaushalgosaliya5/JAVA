import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="Applet5" width=500 height=500>
</applet>
*/

public class Applet5 extends Applet {

 public void paint(Graphics g) {
 
  g.drawArc(50,50,100,100,0,90); 
  g.fillArc(50,150,100,100,0,90);
  g.fillArc(50,250,100,100,90,135); 

 } 
}
