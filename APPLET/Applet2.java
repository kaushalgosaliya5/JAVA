import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="Applet2" height=500 width=500>
</applet>
*/

public class Applet2 extends Applet {
 
 public void paint(Graphics g) {

 g.drawLine(25,25,100,100);  // g.drawLine(x1,y1,x2,y2)
 g.drawLine(100,30,200,30);
 g.drawRect(25,110,50,30);   // g.drawLine(x1,y1,width,height);
 g.fillRect(25,150,50,30);   // g.drawLine(x1,y1,width,height);

 g.setColor(Color.red);
 g.fillRect(25,200,50,30);


}
}