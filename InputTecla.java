
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * Classe Responsavel por evento de teclado
 * @author isaura
 */
public class InputTecla implements KeyListener
{
    private boolean cima = false;
    private boolean baixo = false;
    
    private boolean esquerda = false;
    private boolean direita = false;

    public boolean isCima() 
    {
        return cima;
    }

    public void setCima(boolean cima) 
    {
        this.cima = cima;
    }

    public boolean isBaixo()
    {
        return baixo;
    }

    public void setBaixo(boolean baixo)
    {
        this.baixo = baixo;
    }

    public boolean isEsquerda() {
        return esquerda;
    }

    public void setEsquerda(boolean esquerda) {
        this.esquerda = esquerda;
    }

    public boolean isDireita() {
        return direita;
    }

    public void setDireita(boolean direita) {
        this.direita = direita;
    }
    
    
    
    
    

    @Override
    public void keyTyped(KeyEvent e)
    {
        //System.out.println(""+e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println(""+e.getKeyCode());
        
        if(e.getKeyCode() == KeyEvent.VK_UP) //Tecla responsavel por aumentar a velocidade de rotacao
        {
            cima = true;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_DOWN) //Tecla responsavel por frear o movimento
        {
            baixo = true;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) //responsavel por movimentar a direita no eixo xx
        {
            direita= true;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            esquerda = true; 
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
       
         if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            //cima = false;
        }
         
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            //baixo = false;
        }
        
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            //direita = false;
        }
         if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            //esquerda = true;
        }
         
         
    }
    
}
