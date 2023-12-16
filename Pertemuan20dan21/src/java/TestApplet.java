

import java.applet.Applet;
import java.awt.*;
public class TestApplet extends Applet {
public void init() { 

 } 
 
public void paint(Graphics g){
 g.setColor(Color.blue); 
 g.fillOval(50, 50, 50, 50);  
 g.drawString("Muhammad Fauzan!", 80,25);
 showStatus ("Contoh Applet Pertemuan 20.");
    }
}
