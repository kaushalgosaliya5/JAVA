import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class AppletRadious  extends Applet {

  int x;

  public void paint(Graphics g){
     g.setColor(Color.red);
     g.fillOval(150,150,x,x);
  } 

  public void init() {
   x = Integer.parseInt(getParameter("length"));
  }
} 