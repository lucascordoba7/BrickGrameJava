
package files;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Paleta {
    
    int x,y,ancho,alto;
    public Paleta(){
        
        y=500;
        x=200;
        ancho=100;
        alto=20;
    }
    public void draw(Graphics2D g){
        g.setColor(Color.black);
        g.fillRect(x, y, ancho, alto);
    }
    public void update(int xn)
    {
       x=xn-ancho/2;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    

   
    
}
