/**
 * @(#)lady.java
 *
 * lady Applet application
 *
 * @author 
 * @version 1.00 2019/5/9
 */
 
import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;


public class lady extends Applet {
	
	public void init() {
	}

	Color skin=new Color(241, 196, 15);
        int x=0;
        int p=200;
        int y=20;
         int i = 0;
         int f=0;
         @Override
         public void paint(Graphics g){
                 x++;
                 g.setColor(Color.black);
                 g.fillArc(80+x, 96, 50, 70, 60, 190);
                 g.setColor(skin);
                 g.fillOval(100+x,100, 40, 60); //face
                 
                 g.setColor(Color.WHITE);
                 g.fillOval(120+x, 110, 12, 8); //eye
                 g.setColor(Color.BLACK);
                 g.fillOval(124+x, 113, 5, 5);  //eye
                                 
                 g.setColor(Color.red);
                 g.drawArc(132+x, 125, 15, 15, 190,60); //mouse
                 
                 int[] body_x={100+x,80+x,160+x,140+x};
                 int[] body_y={160,270,270,160};
                 g.fillPolygon(body_x,body_y,4);  //body
                 //legs
                 g.setColor(skin);
                 int[] xf_leg = {95+x+i,80+x+i,110+x+i,115+x+i,100+x+i,110+x+i};
                 int [] yf_leg = {310,370,370,350,350,310};
                 g.fillPolygon(xf_leg,yf_leg,6);
                 int[] xs_leg = {120+x-i,135+x-i,165+x-i,170+x-i,145+x-i,135+x-i};
                 int[] ys_leg = {310,370,370,350,350,310};
                 g.fillPolygon(xs_leg,ys_leg,6);
                 
                 g.setColor(Color.blue);
                 int skirt_x[]={80+x,60+x,180+x,160+x};
                 int skirt_y[]={270,320,320,270};
                 g.fillPolygon(skirt_x,skirt_y,4);  //skirt
                         
                 g.setColor(Color.ORANGE);                
                 g.fillRect(105+x, 180, 20, 50);
                 int[] arm_x={105+x,125+x,125+x,200+x,200+x,125+x,105+x};
                 int[] arm_y={180,180,210,230,250,230,210};
                 g.fillPolygon(arm_x,arm_y,7);  //arm 
                 
                 g.fillOval(195+x, 230, 25, 25);
                 
                 
                 /*the lady*/
                 g.setColor(Color.black);
                 g.fillArc(80+x+p, 96-y, 50, 70, 60, 190);
                 g.setColor(skin);
                 g.fillOval(100+x+p,100-y, 40, 60); //face
                 
                 g.setColor(Color.WHITE);
                 g.fillOval(120+x+p, 110-y, 12, 8); //eye
                 g.setColor(Color.BLACK);
                 g.fillOval(124+x+p, 113-y, 5, 5);  //eye
                                 
                 g.setColor(Color.red);
                 g.drawArc(132+x+p, 125-y, 15, 15, 190,60); //mouse
                 
                 //legs
                 g.setColor(skin);
                 int[] gxf_leg = {95+x+p+i,80+x+p+i,110+x+p+i,115+x+p+i,100+x+p+i,110+x+p+i};
                 int [] gyf_leg = {310+y,370+y,370+y,350+y,350+y,310+y};
                 g.fillPolygon(gxf_leg,gyf_leg,6);
                 int[] gxs_leg = {120+x+p-i,135+x+p-i,165+x+p-i,170+x+p-i,145+x+p-i,135+x+p-i};
                 int[] gys_leg = {310+y,370+y,370+y,350+y,350+y,310+y};
                 g.fillPolygon(gxs_leg,gys_leg,6);
                 
                 g.setColor(Color.black);
                 int[] gbody_x={100+x+p,60+x+p,180+x+p,140+x+p};
                 int[] gbody_y={160-y,320+y,320+y,160-y};
                 g.fillPolygon(gbody_x,gbody_y,4);  //body
                         
                 g.setColor(Color.ORANGE);
                 g.fillRect(105+x+p, 160+y, 20, 50);
                 int[] garm_x={105+x+p,125+x+p,125+x+p,200+x+p,200+x+p,125+x+p,105+x+p};
                 int[] garm_y={160+y,160+y,190+y,210+y,230+y,210+y,190+y};
                 g.fillPolygon(garm_x,garm_y,7);  //arm          
                 g.fillOval(195+x+p, 230, 25, 25);        
 
                 x++;
                 if(x==200)
                     x=0;
                 if(f==0)
                     i++;
                 if(i==10)
                     i=1;
                 if(f==1)
                     i--;
                 if(i==-10)
                     i=0;
                repaint();
                try{
                    Thread.sleep(30);
                }
                catch(Exception ex){
                }

}
}