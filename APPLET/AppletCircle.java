import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="AppletCircle" width=500 height=500>
</applet>
*/

public class AppletCircle extends Applet {

 public void paint(Graphics g) {
 
  g.setColor(Color.red);
  g.fillArc(50,50,100,100,0,90);
  g.setColor(Color.green);
  g.fillArc(50,50,100,100,90,90);
  g.setColor(Color.pink);
  g.fillArc(50,50,100,100,180,90);
  g.setColor(Color.yellow);
  g.fillArc(50,50,100,100,270,90);

 } 
}
