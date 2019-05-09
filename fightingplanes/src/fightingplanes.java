/**
 * @(#)fightingplanes.java
 *
 * fightingplanes Applet application
 *
 * @author 
 * @version 1.00 2019/5/9
 */
 
import java.awt.*;
import java.applet.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fightingplanes extends Applet {
	int x=0,y=0, i=0;
	public void init() {
	}

	@Override
        public void paint(Graphics g){
            Graphics2D g2 = (Graphics2D)g;
            Rectangle2D l_front = new Rectangle2D.Double(490,y+400,40,2);
            Rectangle2D rocket1 = new Rectangle2D.Double(240, y+250,70,4);
            Rectangle2D rocket2 = new Rectangle2D.Double(220, y+320,150,4);
            Rectangle2D rocket3 = new Rectangle2D.Double(220, y+480,150,4);
            Rectangle2D rocket4 = new Rectangle2D.Double(240, y+550,70,4);
            
            Rectangle2D rocket11 = new Rectangle2D.Double(x+240, 250,100,4);
            Rectangle2D rocket22 = new Rectangle2D.Double(x+220, 320,100,4);
            Rectangle2D rocket33 = new Rectangle2D.Double(x+220, 480,100,4);
            Rectangle2D rocket44 = new Rectangle2D.Double(x+240, 550,100,4);
            Shape cabin = new Ellipse2D.Double(260,y+380,120,40);
            int[]x_part = {400,380,340,300,280,270,270,220,210,240,220,210,200,205,195,205,205,190,205,205,195,205,200,210,220,240,210,220,270,270,280,300,340,380};
             int[]y_part = {y+400,y+380,y+380,y+360,y+250,y+250,y+340,y+320,y+320,y+360,y+360,y+340,y+350,y+360,y+360,y+370,y+390,y+400,y+410,y+430,y+440,y+440,y+450,y+460,y+440,y+440,y+480,y+480,y+460,y+550,y+550,y+440,y+420,y+420};
            GeneralPath body = new GeneralPath();
            body.moveTo(2*x_part[0]-300, y_part[0]);
            for(i=0;i<x_part.length;i++)
                body.lineTo(2*x_part[i]-300, y_part[i]);
            body.closePath();
            g2.setColor(Color.black);
            g2.fill(body);
            g2.fill(l_front);
            g2.fill(rocket1);
            g2.fill(rocket2);
            g2.fill(rocket3);
            g2.fill(rocket4);
            g2.fill(rocket11);
            g2.fill(rocket22);
            g2.fill(rocket33);
            g2.fill(rocket44);
            g2.setColor(Color.WHITE);
            g2.fill(cabin); 
            g2.translate(3*550-300, 800);
            for (i=1;i<3;i++){
                g2.rotate(Math.PI);
                body.moveTo(2*x_part[0]-300, y_part[0]);
                for(i=0;i<x_part.length;i++)
                    body.lineTo(2*x_part[i]-300, y_part[i]);
                body.closePath();
                g2.setColor(Color.black);
                g2.fill(body);
                g2.fill(l_front);
                g2.fill(rocket1);
                g2.fill(rocket2);
                g2.fill(rocket3);
                g2.fill(rocket4);
                g2.fill(rocket11);
                g2.fill(rocket22);
                g2.fill(rocket33);
                g2.fill(rocket44);
                g2.setColor(Color.WHITE);
                g2.fill(cabin);
            }   
            y++;
            x++;
            if(x==600)
                x=0;
            if(y==100)
                y=0;
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(fightingplanes.class.getName()).log(Level.SEVERE, null, ex);
            }
            repaint(1);
        }

}