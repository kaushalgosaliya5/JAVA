import javax.swing.*;
import java.awt.*;

/*
<applet code="JFontSet" width=500 height=500>
</applet>
*/

public class JFontSet extends JApplet {

 Container con;
 JLabel jl; 
 Font fnt = new Font("Aharoni",Font.ITALIC,20);

 public void init(){
  con = getContentPane();
  jl = new JLabel("click me !!!");
  jl.setFont(fnt);

  con.add(jl);
 }
}