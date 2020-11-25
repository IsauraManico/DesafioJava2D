# DesafioJava2D
Criei uma simples animation, com objetos 
girando em cada canto de um  retangulo, todos objetos rotacionando e translando em simultaneo quando acionado o teclado. Programei as teclas cima, baixo, esquerda e Direita, com funcionalidades distintas..


O KeyListener é uma interface (escutador de teclas)
Que serve para fazer um input por teclado,
em um determinado evento do usuário para o
Objeto,... 

Para utilizar, precisamos implementar e sobrescrever,
os seus respectivos métodos.E 
adicionar -lo na JFrame
com addKeyListener(input);;;


Ex: class panel implements KeyListener

public void KeyPressed(KeyEvent e)
{
    //quando pressionar a tecla

     output(e.getKeyCode());
      // retorna o código da tecla
}

public void keyReleased( KeyEvent e)
{
 //Depois de pressionado

}
