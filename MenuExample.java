import java.awt.*;  
class MenuExample extends Frame 
{  
     MenuExample(){  
         setSize(700,400);
         setVisible(true);	
         setLayout(null);		 
         MenuBar mb=new MenuBar();  
         setMenuBar(mb);
		 Menu file=new Menu("File");  
		 mb.add(file);
         MenuItem i1=new MenuItem("New");  
         MenuItem i2=new MenuItem("Open");  
         MenuItem i3=new MenuItem("Save");  
         MenuItem i4=new MenuItem("Exit");  
         file.add(i1);
		 file.add(i2);
		 file.add(i3);
		 file.add(i4);
         
}  
public static void main(String args[])  
{  
MenuExample m = new MenuExample();  
}  
}