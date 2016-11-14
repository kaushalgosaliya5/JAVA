import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="Applet4" width=500 height=500>
</applet>
*/

public class Applet4 extends Applet {

 public void paint(Graphics g) {
 
  g.drawOval(50,50,100,100);
  g.fillOval(50,200,100,100);

 } 
}
