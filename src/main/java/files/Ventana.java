
package files;

import java.awt.Canvas;
import java.awt.Color;

import java.awt.Dimension;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    final int ANCHO=800;
    final int ALTO=600;
    Thread hilo;
    Graphics g;
    Canvas canvas;
    
       public static void main(String[] args) throws InterruptedException {
        Ventana v=new Ventana();
        
}
       public Ventana() throws InterruptedException{
           hilo=new Thread();
           setTitle("Tennis v1.0");
           setSize(ANCHO,ALTO);
           setLocationRelativeTo(null);
           setResizable(false);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           
           Juego j=new Juego();
           j.setSize(this.getWidth(),this.getHeight());
           System.out.println(j.getSize());
           System.out.println(getSize());
           
           
           add(j);
           
           j.setVisible(true);
           setVisible(true);
           j.setJuego(getContentPane().getWidth(),getContentPane().getHeight());
           
           while(true)
           {    
               j.repaint();
               hilo.sleep(10);
           }
          
           
       }
       

  
       
       
       
       
}
