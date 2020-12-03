
package files;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;


public class Juego extends JPanel implements MouseMotionListener {
    int w,h;
    Pelota pelota;
    Paleta paleta;
    int x;
    public Juego(){
        
        pelota=new Pelota();
        paleta=new Paleta();
        addMouseMotionListener(this);
        
    }
    public void setJuego(int w, int h)
    {
        this.w=w;
        this.h=h;
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d=(Graphics2D)g;
        g2d.clearRect(0, 0, w, h);
        pelota.update();
        paleta.update(x);
        pelota.draw(g2d);
        paleta.draw(g2d);
        
        comprobar();
	
	
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.x=e.getX();
    }
    
   public void comprobar()
   {
       //System.out.println(pelota.getX()+"---"+w);
       if(pelota.getX()<0 || pelota.getX()>w-pelota.getSize())
       {
           pelota.setVx(-1*pelota.getVx());
       }
       if(pelota.getY()<0)
       {
           pelota.setVy(-1*pelota.getVy());
       }
       if((pelota.getY()+pelota.getSize()>=paleta.getY())&& pelota.getX()+pelota.getSize()>= paleta.getX() && pelota.getX()<= (paleta.getX()+paleta.getAncho()))
       {
           pelota.setVy(-1*pelota.getVy());
       }
       if(pelota.getY()>h)
       {
           System.exit(1);
       }
   }
    
}
