
 
import java.awt.*;
import java.applet.*;

public class fan extends Applet {
	
	public void init() {
	}

        int i=0;

	public void paint(Graphics g) {
	g.setColor(Color.cyan)	;
	g.fillRect(100,180,80,20); // fan body
	g.setColor(Color.lightGray);
	int[]xp={110,170,110,140,140,170};
	int[]yp={180,180,180,110,110,180};
	g.fillPolygon(xp,yp,6);
	
	g.setColor(Color.white);
	g.fillOval(110,110,60,60);
	
	g.setColor(Color.black);
	for(int j=0;j<360;j+=90)
	{
		g.fillArc(110,110,60,60,j-i,30);
	}
	
       i+= 5;
       if(i==360)i=0;
       repaint();
       try{Thread.sleep(10);}	catch(Exception ex){};

	}
} 