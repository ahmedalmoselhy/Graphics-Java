
 
import java.awt.*;
import java.applet.*;

public class four_circles_moving_in_aktar extends Applet {
	
	public void init() {
	}
int x=0,i=0;
Color [] alwan={Color.blue,Color.cyan,Color.red,Color.GREEN,Color.yellow,Color.magenta,Color.orange,Color.pink};

	public void paint(Graphics g) {
		
		g.setColor(Color.red);
		g.fillOval(x,x,60,60);
		g.setColor(Color.green);
		g.fillOval( 200-x,0+x,60,60);
		g.setColor(Color.yellow);
		g.fillOval(x,200-x,60,60);
		g.setColor(Color.magenta);
		g.fillOval(200-x,200-x,60,60);
		x++;
		if(x>=100)
			{ x=100;
		      g.setColor(Color.black);
		      g.drawOval(90,90,80,80);
		      for(int j=0;j<360;j+=45)
		      {
		      	g.setColor(alwan[j/45]);
		      	g.fillArc(90,90,80,80,j-i,45);
		      }
		    }
		    i++; if(i==360) i=0;
		    repaint();
		    try{Thread.sleep(10);}
		    catch(Exception ex){};
	}
}