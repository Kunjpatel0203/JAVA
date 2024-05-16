import java.awt.*;
import java.awt.Graphics.*;
class MyFrame extends Frame
{
  MyFrame()
  {
   super("FlowLayOut Demo");
   setSize(600,400);
   setVisible(true);
    setLayout(new FlowLayout());
  //setLayout(new FlowLayout(FlowLayout.CENTER, 20,25));
   setLayout(new FlowLayout(FlowLayout.LEFT, 200, 250));
   Button b1 = new Button("Submit");
   add(b1);
   Button b2 = new Button("Cancel");
   add(b2);
  }
}
class FlowLayoutDemo
{
   public static void main(String args[])
   {
     MyFrame f = new MyFrame();
   }
}