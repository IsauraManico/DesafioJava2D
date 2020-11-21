
import javax.swing.JFrame;



/**
 *
 * @author isaura
 */
public class PrincipalFrame  extends JFrame
{
    
    public PrincipalFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Drawing in Java");
        
        setSize(1000,800);
        add( new Panel_Desenho());
        
        addKeyListener(Panel_Desenho.input);//Adiciona o KeyListener na frame
        
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new PrincipalFrame();
        
    }
}
