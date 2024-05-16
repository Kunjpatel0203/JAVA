import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class getSourceExample extends Frame implements ActionListener
{   Button b1,b2; 
    boolean c = false; 
	String s1="";
    getSourceExample()
	{  
	   setSize(600,500);
	   setVisible(true);
	   setLayout(new FlowLayout());
	   b1 = new Button("rect");
	   add(b1);
	   b2 = new Button("circle");
	   add(b2);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	    
	}
	public void actionPerformed(ActionEvent e)
	{   s1 = e.getActionCommand();
		c=true;
		repaint();
	}
	public void paint(Graphics g)
	{
	    if(c)
		{
			if(s1.equals("rect"))
		    g.drawRect(50,50,100,100);
            else if(s1.equals("circle"))
            g.drawOval(100,100,50,50);				
			c=false;
		}
	}  
	public static void main(String args[])
	{
		getSourceExample d1 = new getSourceExample();
	}


}