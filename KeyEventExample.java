import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;

class KeyEventExample extends Frame implements KeyListener
{   int keyget=0;
    TextArea ta;
   KeyEventExample()
   {
     setSize(700,400);
	 setVisible(true);
	 setLayout(new FlowLayout());
	 ta = new TextArea();
	 add(ta);
	 ta.addKeyListener(this);
   }
   public void keyTyped(KeyEvent e)
   {
     
   }
   public void keyPressed(KeyEvent e)
   {
	   ta.append("Entered Character="+e.getKeyChar()+"\n");
	   ta.append("Code of Entered Character="+e.getKeyCode()+"\n");
    
   }
   public void keyReleased(KeyEvent e)
   {
   }
   
   public static void main(String args[])
   {
	   KeyEventExample w = new KeyEventExample();
   }


}