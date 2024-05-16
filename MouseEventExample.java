import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class MouseEventExample extends Frame implements MouseListener
{   boolean c=false;
    MouseEventExample()
	{  setSize(600,500);
	   setVisible(true);
	   addMouseListener(this);
	    
	}
	public void mouseClicked(MouseEvent e)
	{
		setBackground(Color.RED);
		c=true;
		repaint();
			   
	}public void mousePressed(MouseEvent e)
	{
		
	}public void mouseReleased(MouseEvent e)
	{
		
	}public void mouseEntered(MouseEvent e)
	{
		
	}public void mouseExited(MouseEvent e)
	{
		
	}
	public void paint(Graphics g)
	{
		if(c)
		{
		g.drawRect(50,50,100,100); 
		c=false;
		}
	}
	   
	public static void main(String args[])
	{
		MouseEventExample d1 = new MouseEventExample();
	}


}