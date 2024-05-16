import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class ActionDemo_Button extends Frame implements ActionListener
{   Button b1;boolean c=false;
    ActionDemo_Button()
	{  
	   setSize(600,500);
	   setVisible(true);
	   setLayout(new FlowLayout());
	   b1=new Button("Click");
	   add(b1);
	   b1.addActionListener(this);
	   
	    
	}
	
	public void actionPerformed(ActionEvent e)
	{
		c=true;
		repaint();
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
		ActionDemo_Button d1 = new ActionDemo_Button();
	}


}