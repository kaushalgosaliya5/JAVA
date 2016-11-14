import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="Applet3b" width=500 height=500>
</applet>
*/


public class Applet3b extends Applet {

 public void paint(Graphics g) {
 
  Color a[] =   {Color.red,Color.green,Color.pink,Color.black,Color.white,Color.yellow,Color.magenta,Color.cyan};
 
  int x = 500 / a.length;

  for(int i=0;i<a.length;i++) { 
   g.setColor(a[i]);
   g.fillRect(i*x,0,x,500);
  }

 } 
}