import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="AppletCycle" width=500 height=500>
</applet>
*/


public class AppletCycle extends Applet {
 
  String s = "";

 public void init(){
   s += "init ;";
 }

 public void start(){
   s += "start ;";
 }

 public void paint(Graphics g){
   g.drawString(s,50,50);
 }
 
 public void stop() {
   s += "stop ;";
 }

 public void destroy() {
   System.out.println(s + " APPLET destroy ;");
 }
}
