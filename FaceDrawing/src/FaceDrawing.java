/**
 * @(#)FaceDrawing.java
 *
 * FaceDrawing Applet application
 *
 * @author 
 * @version 1.00 2019/5/2
 */
 
import java.awt.*;
import java.applet.*;

public class FaceDrawing extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		
		g.fillArc(100, 100, 80, 80, 0, 180); //hair
		g.drawOval(110, 110, 60, 60); // head
		g.setColor(Color.white);
		
		g.fillOval(110, 110, 60, 60); // head
		
		// eyes
		g.setColor(Color.black);
		g.drawOval(120, 120, 10, 20);
		g.drawOval(150, 120, 10, 20);
		g.fillOval(120, 130, 10, 10);
		g.fillOval(150, 130, 10, 10);
		
		// right hair
		g.fillOval(100, 140, 10, 10);
		g.fillOval(100, 150, 10, 10);
		g.fillOval(100, 160, 10, 10);
		
		// left hair
		g.fillOval(170, 140, 10, 10);
		g.fillOval(170, 150, 10, 10);
		g.fillOval(170, 160, 10, 10);
		
		// mouth
		g.setColor(Color.black);
		g.fillArc(125, 150, 30, 20, 180, 360);
	}
}