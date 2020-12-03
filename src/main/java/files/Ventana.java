
package files;

import java.awt.Canvas;


import java.awt.Graphics;

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
