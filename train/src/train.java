package train;
 import java.applet.*;
 import java.awt.*;
 import java.awt.geom.Arc2D;
 import java.awt.geom.Ellipse2D;
 import java.awt.geom.GeneralPath;
 import java.awt.geom.Rectangle2D;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 
 public class train extends Applet{
     int x=0,i=0,j=0,y=0,h=0;
     public void init() {
	}
     @Override
     public void paint(Graphics g){
         Graphics2D g2d = (Graphics2D)g;
         //RailWay
         Rectangle2D railway1 = new Rectangle2D.Float(0,220,this.getWidth(),10);
         g2d.fill(railway1);
         //back cars
         for (j=0;j<2;j++){
         Rectangle2D car1 = new Rectangle2D.Float(x,90,200,100);
         g2d.fill(car1);
         Rectangle2D connect1 = new Rectangle2D.Float(x+200,100,10,10);
         g2d.fill(connect1);
         Rectangle2D connect2 = new Rectangle2D.Float(x+200,170,10,10);
         g2d.fill(connect2);
         g2d.setColor(Color.white);
         Rectangle2D win1 = new Rectangle2D.Float(x+10,100,30,40);
         g2d.fill(win1);
         Rectangle2D win2 = new Rectangle2D.Float(x+80,100,30,40);
         g2d.fill(win2);
         Rectangle2D win3 = new Rectangle2D.Float(x+150,100,30,40);
         g2d.fill(win3);
         Ellipse2D  wheel1 = new Ellipse2D.Float(x+10,190,30,30);
         g2d.fill(wheel1);
         Ellipse2D  wheel2 = new Ellipse2D.Float(x+160,190,30,30);
         g2d.fill(wheel2);
         g2d.setColor(Color.black);
         g2d.draw(wheel1);
         g2d.draw(wheel2);
         for(i=0;i<360;i+=90){
         Arc2D w1 = new Arc2D.Float(x+10,190,30,30,i-h,20,Arc2D.PIE);
         Arc2D w2 = new Arc2D.Float(x+160,190,30,30,i-h,20,Arc2D.PIE);
         g2d.fill(w2);
         g2d.fill(w1);
         }     
         
         g2d.translate(210,0);
         }
 
         //Front car
         g2d.setColor(Color.blue);
         GeneralPath front = new GeneralPath();
         front.moveTo(0+x, 90);
         int xp[] = {0+x,150+x,150+x,160+x,160+x,200+x,200+x,180+x,180+x,140+x,140+x,121+x,121+x,30+x,30+x,0+x};
        int yp[] = {90,90,70,70,90,90,200,200,179,179,200,200,130,130,200,200};
        for (int k=0;k<xp.length;k++){
            front.lineTo(xp[k], yp[k]);
        }
        front.closePath();
        g2d.fill(front);
        g2d.setColor(Color.white);
        Ellipse2D largWheel = new Ellipse2D.Float(30+x,130,90,90);
        g2d.fill(largWheel);
        Ellipse2D  Smallwheel = new Ellipse2D.Float(140+x,180,40,40);
        g2d.fill(Smallwheel);
        g2d.setColor(Color.black);
        g2d.draw(largWheel);
        g2d.draw(Smallwheel);
        for(i=0;i<360;i+=90){
        Arc2D wLarg = new Arc2D.Float(30+x,130,90,90,i-h,20,Arc2D.PIE);
        Arc2D wSmall = new Arc2D.Float(140+x,180,40,40,i-h,20,Arc2D.PIE);
        g2d.fill(wLarg);
        g2d.fill(wSmall);
        }
        g2d.setColor(Color.white);
        Rectangle2D win3 = new Rectangle2D.Float(140+x,100,40,40);
        g2d.fill(win3);
        x++;
        if(x==this.getWidth()){
            x=0;
        }
        h++;
        if (h==360){
            h=0;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(train.class.getName()).log(Level.SEVERE, null, ex);
        }
        repaint(1); 
    }
}

