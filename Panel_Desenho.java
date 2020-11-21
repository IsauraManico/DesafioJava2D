
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javafx.scene.shape.Ellipse;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



/**
 *
 * @author isaura
 */
public class Panel_Desenho extends JPanel implements Runnable
{
    Thread thread;
    
    static InputTecla input = new InputTecla();
    
    private int  ang1 = 45;
    private int ang2 =20;
    private int r = 10;
    
    Objectos retang = new Objectos(100,200,300,250);
    Objectos im = new Objectos(500,300,100,100);
   
    public Panel_Desenho()
    {
        thread = new Thread(this);
        
        
        thread.start();
        
        im.setImg( new ImageIcon(getClass().getResource("img/imagem.png")).getImage());
    }
    
    public void paintComponent( Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D)g;
        
        AffineTransform b = g2d.getTransform();
        
        g2d.translate(r, 0); //Translate controlador do movimento no eixo dos x quando pressionado a tecla direita
        
        AffineTransform p = g2d.getTransform();
        
                g2d.rotate(Math.toRadians(ang2), retang.getPosicaoX()+(retang.getAltura()/2),
                                                retang.getPosicaoY()+(retang.getLargura()/2));
                g2d.setColor(Color.red);
                Rectangle.Double r = new  Rectangle.Double(retang.getPosicaoX(),retang.getPosicaoY(),retang.getLargura(),
                                                            retang.getAltura());
                g2d.fill(r);


                AffineTransform p1 = g2d.getTransform(); //AffineTransform pai responsavel pela rotacao de todos objectos
                                                         //no mesmo sentido

                    g2d.rotate(Math.toRadians(ang1), retang.getPosicaoX(),retang.getPosicaoY());
                    g2d.setColor(Color.blue);
                    Rectangle.Double r1 = new Rectangle.Double(retang.getPosicaoX(),retang.getPosicaoY(),15,15);
                    g2d.fill(r1);

                g2d.setTransform(p1);
                p1 = g2d.getTransform();

                AffineTransform p2 = g2d.getTransform();

                        g2d.rotate(Math.toRadians(ang1), (retang.getPosicaoX()+(retang.getLargura()/2)),
                                                                      retang.getPosicaoY()+(retang.getAltura()/2));
                        g2d.setColor(Color.pink);
                        Rectangle.Double r2 = new Rectangle.Double(retang.getPosicaoX()+(retang.getLargura()/2),
                                                                      retang.getPosicaoY()+(retang.getAltura()/2),15,15);
                        g2d.fill(r2);

                g2d.setTransform(p2);
                p2 = g2d.getTransform();

                AffineTransform p3 = g2d.getTransform();
                        g2d.rotate(Math.toRadians(ang1),retang.getPosicaoX(), retang.getPosicaoY()+(retang.getAltura()));
                        g2d.setColor(Color.green);
                        Rectangle.Double r3 = new Rectangle.Double(retang.getPosicaoX(),
                                                                      retang.getPosicaoY()+(retang.getAltura()),15,15);
                         g2d.fill(r3);
                g2d.setTransform(p3);
                p3 = g2d.getTransform();



                AffineTransform r7 = g2d.getTransform();
                        g2d.rotate(Math.toRadians(ang1), (retang.getPosicaoX()+retang.getLargura()), 
                                                         retang.getPosicaoY()+(retang.getAltura()));
                        g2d.setColor(Color.yellow);
                        Rectangle.Double r4 = new Rectangle.Double(retang.getPosicaoX()+retang.getLargura(),
                                                                      retang.getPosicaoY()+(retang.getAltura()),15,15);
                        g2d.fill(r4);

                g2d.setTransform(r7);
                r7 = g2d.getTransform();

                AffineTransform ob = g2d.getTransform();

                        g2d.rotate(Math.toRadians(ang1), retang.getPosicaoX()+retang.getLargura(),
                                                                      (retang.getPosicaoY()));

                        g2d.setColor(Color.gray);
                        Rectangle2D.Double r5 = new Rectangle2D.Double(retang.getPosicaoX()+retang.getLargura(),
                                                                      (retang.getPosicaoY()),15,15);
                        g2d.fill(r5);

                g2d.setTransform(ob);

                ob = g2d.getTransform();
        
        g2d.setTransform(p);
        p = g2d.getTransform();
        
        
        g2d.rotate(Math.toRadians(ang2), im.getPosicaoX()+(im.getAltura()/2), im.getPosicaoY()+(im.getLargura()/2));
        
        g2d.drawImage(im.getImg(), im.getPosicaoX(),im.getPosicaoY(),im.getLargura(),im.getAltura(), this);
        
        g2d.setTransform(b);
        b = g2d.getTransform();
        
    }
    public void dormir()
    {
        try
        {
            Thread.sleep(10);
        } 
        catch (InterruptedException ex) 
        {
            ex.printStackTrace();
            System.out.println("Ocorreu Um Erro!"+ex);   
        }
    }
    
    public void update()
    {
        if(input.isCima() )
        {
            ang2 +=2;
        }
        
         if(input.isBaixo())
        {
            ang2 = ang2*0;
        }
          
        if(r >= getWidth() || r<=0)
        {
            r*=0;
        }
       
        if(input.isDireita())
        {
            //r*=r*(-1);
            r = r +2;
        }
        if(input.isEsquerda())
        {
            //r*=r*(-1);
            r = r -1;
        }
       
    }

    @Override
    public void run()
    {
        while (true)
        {
            this.ang1++;
           this.ang2++;
           
            
            this.update();
            this.repaint();
            this.dormir();
        }
        
        
    }
    
}
