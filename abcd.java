import java.awt.*;
class MyFrame extends Frame
{
  MyFrame()
  {
   super("GridBagLayout Demo");
   setSize(600,400);
   setVisible(true);
   GridBagLayout grid = new GridBagLayout();  
   GridBagConstraints gbc = new GridBagConstraints();  
   setLayout(grid);
   TextArea t1=new TextArea();
   gbc.gridx = 0;  
   gbc.gridy = 0;  
   gbc.gridwidth=2;
   //add(t1,gbc);
   Button b1=new Button("1");
   gbc.gridx=0;
   gbc.gridy=1;
   add(b1,gbc);
   Button b2=new Button("2");
   gbc.gridx=1;
   gbc.gridy=1;
   add(b2,gbc);
   Button b3=new Button("3");
   gbc.gridx=2;
   gbc.gridy=1;
   add(b3,gbc);
   Button b4=new Button("4");
   gbc.gridx=0;
   gbc.gridy=2;
   add(b4,gbc);
  }
}
class abcd
{
   public static void main(String args[])
   {
     MyFrame f = new MyFrame();
   }
} 