import java.awt.*;
import java.awt.Graphics.*;
class MyFrame extends Frame
{
  MyFrame()
  {
   super("GridLayout Demo");
   setSize(600,400);
   setVisible(true);
   setLayout(new GridLayout(2,2,100,100));
   Button b1 = new Button("Submit");
   add(b1);
   Button b2 = new Button("Cancel");
   add(b2);
   Button b3 = new Button("Reset");
   add(b3);
   Button b4 = new Button("Ok");
   add(b4);
  }
}
class GridLayoutDemo
{
   public static void main(String args[])
   {
     MyFrame f = new MyFrame();
   }
}