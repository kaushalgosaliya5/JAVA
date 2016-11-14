import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="Circle" width=500 height=500>
</applet>
*/

public class Circle extends Applet {

 public void paint(Graphics g) {

  Color a[] = {Color.red,Color.green,Color.blue,Color.pink,Color.magenta,Color.cyan};

  for(int i=0;i<6;i++){
  g.setColor(a[i]);
  g.fillArc(50,50,200,200,i*60,60);
  }

 }
}