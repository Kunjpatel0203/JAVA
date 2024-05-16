import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;


class myframe extends Frame implements ItemListener
{
    CheckboxGroup chb;
    Checkbox b1;
    Checkbox b2;
    Checkbox b3;
    int re=0;
    myframe()
    {
        setSize(1000,1000);
        setVisible(true);
        setLayout(new FlowLayout());
        chb=new CheckboxGroup();
        b1=new Checkbox("red", chb, false);
        b2=new Checkbox("ryellow", chb, false);
        b3=new Checkbox("green", chb, false);
        add(b1);
        add(b2);
        add(b3);
        b1.addItemListener(this);
        b2.addItemListener(this);                
        b3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==b1)
        {
            re=1; repaint();
        }
        if(e.getSource()==b2)
        {
            re=2; repaint();
        }
        if(e.getSource()==b3)
        {
            re=3; repaint();
        }
    }

    public void paint(Graphics g)
    {
        g.drawRect(100, 100, 150, 400);
        g.drawOval(110,110,100,100);
        g.drawOval(110,220,100,100);
        g.drawOval(110,330,100,100);

        if(re==1){
            g.setColor(Color.RED);
            g.fillOval(110,110,100,100);
        }
        if(re==2)
        {
            g.setColor(Color.YELLOW);
            g.fillOval(110,220,100,100);
        }
        if(re==3)
        {
            g.setColor(Color.GREEN);
            g.fillOval(110,330,100,100);
        }
    }

}

class trafficlight
{ public static void main(String args[])
    {
        myframe f=new myframe();
    }
}