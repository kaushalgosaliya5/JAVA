import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="abc" width=500 height=500 >
</applet>
*/

public class abc extends Applet {

 public void paint(Graphics g){

/* square

  int a[] = {50,50,150,150};
  int b[] = {100,50,50,100};

  g.drawPolygon(a,b,4);
*/
/* polygon

  int a[] = {50,125,200,160,90};
  int b[] = {100,50,100,150,150};
  
  g.drawPolygon(a,b,5);

*/
/* hexagon
 
  int a[] = {50,50,100,150,150,100};
  int b[] = {150,100,50,100,150,200};
  
  g.drawPolygon(a,b,6);
*/
/* triangle circle

  int a[] = {50,100,150};
  int b[] = {150,50,150};

  g.drawPolyline(a,b,3);
  g.fillOval(50,135,100,30);
*/
/* nalakar
 
  g.fillOval(50,35,100,30);
  g.fillOval(50,185,100,30);

  g.drawLine(50,50,50,200);
  g.drawLine(150,50,150,200);
*/
/*
 g.drawOval(50,50,250,250);
 g.drawArc(100,150,150,100,180,180);
 g.drawArc(100,100,75,100,45,105);
 g.drawArc(180,100,75,100,30,105);
*/
// star  
  int a[] = {100,150,200,80,220,100};
  int b[] = {200,50,200,100,100,200};
   
  g.drawPolyline(a,b,6);
 
 }
}

