import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="Applet3a" width=500 height=500>
</applet>
*/


public class Applet3a extends Applet {

 public void paint(Graphics g) {

  g.setColor(Color.red);
  g.fillRect(0,0,50,500);
  g.setColor(Color.black);
  g.fillRect(50,0,50,500);

  g.setColor(Color.yellow);
  g.fillRect(100,0,50,500);
  g.setColor(Color.pink);
  g.fillRect(150,0,50,500);

  g.setColor(Color.green);
  g.fillRect(200,0,50,500);
  g.setColor(Color.blue);
  g.fillRect(250,0,50,500);

 
  Color c1 = new Color(50,50,50);
  g.setColor(c1);
  g.fillRect(300,0,50,500);
  Color c2 = new Color(100,100,100);
  g.setColor(c2); 
  g.fillRect(350,0,50,500);

  Color c3 = new Color(150,150,150);
  g.setColor(c3);
  g.fillRect(400,0,50,500);
  Color c4 = new Color(255,255,256);
  g.setColor(c4);
  g.fillRect(450,0,50,500);

 } 
}