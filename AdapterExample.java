import java.awt.*;    
import java.awt.event.*;    
  
public class AdapterExample extends WindowAdapter {  
    Frame f;    
    AdapterExample() { 
    f = new Frame();	
        
    f.addWindowListener( new WindowAdapter()
	   {
		   public void windowClosing(WindowEvent e)
		   {
			 System.exit(0);  
		   }
	   }
	   
	   );		
        f.setSize (400, 400);    
        f.setVisible (true);    
    }    
  
public static void main(String[] args) {    
   AdapterExample d1 =  new AdapterExample();    
}    
}    