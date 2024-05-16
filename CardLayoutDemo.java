import java.awt.*;
import java.awt.Graphics.*;
class MyFrame extends Frame
{
  MyFrame()
  {
   super("CardLayout Demo");
   setSize(600,400);
   setVisible(true);
   CardLayout c1 = new CardLayout();
	 setLayout(c1);
	 Panel p1 = new Panel();
	 Panel p2 = new Panel();
	 p1.add(new Button("Submit"));
	 p1.add(new Button("CAncel"));
	 
	 p2.add(new Label("Show"));
	 p2.add(new Label("Cancel"));
	 
	 add(p1,"Card1");
	 add(p2,"Card2");
	 
	 c1.show(this,"Card1");

  }
}
class CardLayoutDemo
{
   public static void main(String args[])
   {
     MyFrame f = new MyFrame();
   }
}