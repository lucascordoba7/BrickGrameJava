
package files;


import java.awt.Color;
import java.awt.Graphics2D;

public class Pelota {
    
    int x,y,vx,vy,size;
    public Pelota()
    {   
        
        x=200;
        y=100;
        size=20;
        vx=3;
        vy=4;
        
    }
    public void draw(Graphics2D g){
        g.setColor(Color.red);
        g.fillOval(x, y, size, size);
        
        
    }
    public void update()
    {
        x+=vx;
        y+=vy;
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }
    
}
