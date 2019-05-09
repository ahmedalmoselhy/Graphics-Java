package plane;

import java.applet.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

public class plane extends Applet{
         int y=0, i=0;
         public void init() {
		}
         
         public void paint(Graphics g){
             Graphics2D g2 = (Graphics2D)g;
             Rectangle2D l_front = new Rectangle2D.Double(490,y+400,40,2);
             Rectangle2D rocket1 = new Rectangle2D.Double(240, y+250,70,4);
             Rectangle2D rocket2 = new Rectangle2D.Double(220, 320,150,4);
             Rectangle2D rocket3 = new Rectangle2D.Double(220, 480,150,4);
             Rectangle2D rocket4 = new Rectangle2D.Double(240, 550,70,4);
             Shape cabin = new Ellipse2D.Double(260,380,120,40);
             int[]x_part = {400,380,340,300,280,270,270,220,210,240,220,210,200,205,195,205,205,190,205,205,195,205,200,210,220,240,210,220,270,270,280,300,340,380};
            int[]y_part = {400,380,380,360,250,250,340,320,320,360,360,340,350,360,360,370,390,400,410,430,440,440,450,460,440,440,480,480,460,550,550,440,420,420};
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
            g2.setColor(Color.WHITE);
            g2.fill(cabin); 
        }
}

