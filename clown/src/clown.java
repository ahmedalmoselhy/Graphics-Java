
 
import java.awt.*;
import java.applet.*;

public class clown extends Applet {
	
	public void init() {
	}
       int x=0,i=0,n=0,m=0;
	public void paint(Graphics g) {
		g.setColor(Color.yellow);//clown head
		g.fillOval(60+x,40,40,40);
		
		g.setColor(Color.red); //hat
		int[]xp_hat={80+x,60+x,100+x};
		int[]yp_hat={0,50,50};
		g.fillPolygon(xp_hat,yp_hat,3);
		
		int[]xp_body={70+x,70+x,50+x,50+x,110+x,110+x,90+x,90+x}; //clown body 
		int[]yp_body={80,100,115,190,190,115,100,80};
		g.fillPolygon(xp_body,yp_body,8);
		
		g.setColor(Color.green); //clown arm
		int []xp_arm={70+x,70+x,120+x,140+x,140+x,120+x,90+x,90+x};
		int[] yp_arm={110,140,170,170,150,150,130,110};
		g.fillPolygon(xp_arm,yp_arm,8);
		g.setColor(Color.yellow);
		g.fillOval(140+x,150,20,20);
		
		g.setColor(Color.blue); // clown legs
		int[]xp_leg={110+x,110+x+n,130+x+n,130+x+n,90+x+n,80+x+n,70+x-n,90+x-n,90+x-n,50+x-n,50+x};
		int[]yp_leg={190,280,280,300,300,260,285,285,300,300,190};
		g.fillPolygon(xp_leg,yp_leg,11);
		
		g.setColor(Color.yellow); // ball
		g.fillOval(30+x,300,120,120);
		g.setColor(Color.red);
		for(int j=0; j<360;j+=90)
		{
			g.fillArc(30+x,300,120,120,j-i,30);
		}
	        x++;    if(x==this.getBounds().width)x=0;
                i++;	        if(i==360)   	i=0;
                if(m==0){n++;if(n==10)m=1;}//7arket elregl
        
                if(m==1){n--;if(n==-10)m=0;}
	        repaint();
     	       try{Thread.sleep(10);} catch(Exception ex){};	
	}
}