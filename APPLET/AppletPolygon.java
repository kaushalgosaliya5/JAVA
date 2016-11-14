import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="AppletPolygon" width=500 height=500>
</applet>
*/

public class AppletPolygon extends Applet {

 public void paint(Graphics g) {
 
  int x[] = {50,100,150};
  int y[] = {150,50,150};

  g.setColor(Color.red);
  g.fillPolygon(x,y,3);  

  int a[] = {50,100,150};
  int b[] = {300,200,300};

  g.drawPolyline(a,b,3);

}
}