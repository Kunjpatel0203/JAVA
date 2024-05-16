import java.awt.*;
import java.awt.event.*;

class ItemEvent_List_Choice extends Frame implements ItemListener
{
	List l;
	Choice c;
	TextArea ta1, ta2;
   ItemEvent_List_Choice()
   {
     setSize(700,400);
	 setVisible(true);
	 setLayout(new GridLayout(2,2));
	 l= new List();
	 l.add("List1");
	 l.add("List2");
	 l.add("List3");
	 
	 c=new Choice();
	 c.add("Choice1");
	 c.add("Choice2");
	 c.add("Choice3");
	 
	 ta1 = new TextArea("kunj");
	 ta2 = new TextArea("kunj");
	 add(l);
	 add(c);
	 add(ta1);
	 add(ta2);
	 
	 l.addItemListener(this);
	 c.addItemListener(this);
   }
   public void itemStateChanged(ItemEvent e)
   {
	if(e.getSource().equals(l))
	{
		String s = l.getSelectedItem();
		ta1.append("\n"+s);
	}	
    if(e.getSource().equals(c))
	{
		String s = c.getSelectedItem();
		ta2.append("\n"+s);
	}		
	   
   }
   public static void main(String args[])
   {
	   ItemEvent_List_Choice w = new ItemEvent_List_Choice();
   }


}