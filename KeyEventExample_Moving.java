import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;

class KeyEventExample_Moving extends Frame implements KeyListener
{   int kx=150;
    int ky=150;
   KeyEventExample_Moving()
   {
     setSize(700,400);
	 setVisible(true);
	 addKeyListener(this);
   }
   public void keyTyped(KeyEvent e)
   {
     
   }
   public void keyPressed(KeyEvent e)
   {
	   switch(e.getKeyCode())
	   {
	     case KeyEvent.VK_DOWN:
		   ky+=10;
		   break;
		 case KeyEvent.VK_UP:
		   ky-=10;
		   break;
		 case KeyEvent.VK_LEFT:
		   kx-=10;
		   break;
		 case KeyEvent.VK_RIGHT:
		   kx+=10;
		   break;
	   }
	   repaint();
    
   }
   public void keyReleased(KeyEvent e)
   {
   }
   public void paint(Graphics g)
   {
     g.drawString("H",kx,ky);
   }
   public static void main(String args[])
   {
	   KeyEventExample_Moving w = new KeyEventExample_Moving();
   }


}