
 
import java.awt.*;
import java.applet.*;

public class camel extends Applet {
	
	public void init() {
	}
	int x=0,i=0,j=0;

	public void paint(Graphics g) {
		int[]xp_camel={x,10+x,150+x,190+x,195+x,200+x,205+x,210+x,210+x,190+x,150+x,
		150+x+j,160+x+j,160+x+j,140+j+x,130+x,130+x-j,140+x-j,140+x-j,120+x-j,110+x,
		50+x,50+x+j,60+x+j,60+x+j,40+x+j,30+x,30+x-j,40+x-j,40+x-j,20+x-j,10+x};
		
		int[]yp_camel={120,100,100,50,30,50,30,50,70,70,140,250,250,260,260,140,250
			,250,260,260,140,140,250,250,260,260,140,250,250,260,260,140};
		
		g.setColor(Color.yellow);
		g.fillPolygon(xp_camel,yp_camel,32);
		g.fillArc(10+x,40,140,120,0,180);  // back of the camel
		g.fillArc(50+x,120,60,40,180,180); // batn el camel
		g.fillArc(190+x,50,40,20,270,180); // bo2 el camel
		
		g.setColor(Color.black);
		g.fillOval(200+x,50,10,10);// camel eye
		
		g.setColor(Color.yellow); //camel tail
		g.drawLine(x,120,x,150);
		
		g.fillOval(260+x,60,30,30);//man head
		
		int[]xp_man={270+x,280+x,280+x,290+x,300+x,250+x,260+x,270+x}; // man body
		int[]yp_man={90,90,100,110,240,240,110,100};
		g.fillPolygon(xp_man,yp_man,8);
		
		g.setColor(Color.blue);
		int[]xp_man_arm={270+x,280+x,280+x,300+x,300+x,280+x,270+x}; //man arm
		int[]yp_man_arm={110,110,130,110,120,150,140};
		g.fillPolygon(xp_man_arm,yp_man_arm,7);
		g.fillOval(300+x,110,10,10);
		
		g.setColor(Color.green);
		int[]xp_first_leg={280+x,290+x,290+x+j,300+x+j,300+x+j,280+x+j};// man first leg
		int[]yp_first_leg={240,240,250,250,260,260};
		g.fillPolygon(xp_first_leg,yp_first_leg,6);
		
	int[]xp_second_leg={260+x,270+x,270+x-j,280+x-j,280+x-j,260+x-j};// man second leg
	int[]yp_second_leg={240,240,250,250,260,260};
	g.setColor(Color.pink);
	g.fillPolygon(xp_second_leg,yp_second_leg,6);
	
	g.setColor(Color.black);
	g.drawLine(220+x,70,220+x,120);
	g.drawArc(220+x,60,85,120,180,180);
	
	x++;if(x==this.getBounds().width)x=-310;
	if(i==0)
		{
			j++;
			if(j==10)
				i=1;
	    }
	    
	   	if(i==1)
		{
			j--;
			if(j==-10)
				i=0;
	    } 
	    	
	    	repaint();
	    	try{Thread.sleep(10);} catch(Exception ex){};
		
	
		
	}
}