
import java.awt.Image;



/**
 *
 * @author isaura
 */
public class Objectos 
{
    private int posicaoX,posicaoY,largura,altura;
    private int velX = 3;
    private int velY = 3;
    
    private Image img;

    public Objectos(int posicaoX, int posicaoY, int largura, int altura) 
    {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.largura = largura;
        this.altura = altura;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public Image getImg()
    {
        return img;
    }

    public void setImg(Image img) 
    {
        this.img = img;
    }
    
    
    
    
    
    
    
    
}
