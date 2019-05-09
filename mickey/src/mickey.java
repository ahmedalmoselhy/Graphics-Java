package mickey;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.applet.*;
public class mickey extends Applet {
        Font Font;
        Color Bgcolor;
         Color flesh;
         Color orange;
         Color pink;     
         int v=0;
         
         //@Override
         public void init() {
	}
         
         public void paint (Graphics g){
                 g.setColor(Color.black);
                 g.fillOval(60+v,50,50,50);
                 g.fillOval(170+v,50,50,50);
                 g.fillOval(90+v,70,100,90);
                 g.setColor(flesh);
                 
                 g.fillOval(110+v,80,60,80);
                 g.fillArc(90+v,70,100,90,180,180);
                 g.fillOval(90+v,110,30,8);
                 g.fillOval(160+v,110,30,8);
                 g.setColor(Color.black);
                 int[] x={130+v,150+v,140+v,130+v};
                 int y[]={80,80,90,80};
                 
                 int n=4;
                 g.fillPolygon(x,y,n);
                 g.setColor(Color.white);
                 g.fillArc(120+v,95,18,40,0,180);
                 g.fillArc(140+v,95,18,40,0,180);
                 g.setColor(Color.black);
                 
                 g.fillRoundRect(130+v,115,20,10,50,50);
                 g.fillOval(125+v,100,10,15);
                 g.fillOval(145+v,100,10,15);
                 g.drawArc(115+v,120,50,20,190,170);
                 g.drawArc(113+v,127,15,20,95,85);
                 g.drawArc(153+v,127,15,20,85,-85);
                 
                 g.fillArc(130+v,130,30,20,180,200);
                 g.setColor(orange);
                 g.fillArc(138+v,145,15,10,10,165);
                 g.setColor(Color.black);
                 int x1[]={120+v,170+v,210+v,200+v,190+v,170+v,170+v,110+v,110+v,90+v,70+v,120+v};
                 int y1[]={160,160,220,230,220,190,220,220,210,210,190,160};
                 
                 int n1=12;g.fillPolygon(x1,y1,n1);
                 g.setColor(Color.white);
                 g.fillOval(70+v,210,50,40);
                 g.setColor(Color.blue);
                 
                 g.fillArc(38+v,190,133,60,0,90);
                 g.fillArc(98+v,180,40,80,135,135);
                 g.fillRect(118+v,220,52,39);
                 
                 g.setColor(Color.white);
                 g.fillOval(160+v,220,50,40);
 
                 g.setColor(Color.black);
                 g.drawArc(130+v,218,20,40,180,88);
                 int x2[]={118+v,138+v,148+v,128+v,118+v};
                 int y2[]={259,259,295,290,259};
                 int n2=5;
                 
                 g.fillPolygon(x2,y2,n2);
                 int x3[]={148+v,168+v,178+v,158+v,148+v};
                 int y3[]={259,259,290,295,259};
                 int n3=5;g.fillPolygon(x3,y3,n3);
                 g.drawOval(80+v,290,90,40);
                 
                 g.setColor(Color.YELLOW);  // color of legs circles
                 
                 g.fillOval(80+v,290,90,40);
                 g.fillOval(140+v,290,80,40);
                 g.setColor(Color.BLACK);
                 g.drawOval(140+v,290,80,40);
                 
                 g.drawLine(170+v,240,180+v,230); 
                 g.drawLine(170+v,250,185+v,235);
                 g.drawLine(180+v,250,190+v,240);
                 
                 g.drawArc(150+v,258,40,40,0,90);
                 
         }
 
         
        public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==39){
                        //right key
                        v+=5;
                        this.repaint();
                }
                if(e.getKeyCode()==37){
                        // left key
                        v-=5;
                        this.repaint();
                }
        }

        
        public void keyReleased(KeyEvent e) {   
        }

        
        public void keyTyped(KeyEvent e) {
        }
        }
