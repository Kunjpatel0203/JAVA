import java.awt.*;

class MyFrame extends Frame {
    MyFrame() {
        setSize(600, 400);
        setVisible(true);
 Button b1 = new Button("B1");
Button b2 = new Button("B2");
Button b3 = new Button("B3");
Button b4 = new Button("B4");
Button b5 = new Button("B5");
TextArea t1=new TextArea("textarea");
TextArea t2=new TextArea("textarea");
TextArea t3=new TextArea("textarea");

GridBagLayout gbl = new GridBagLayout();
setLayout(gbl);
GridBagConstraints gcon = new GridBagConstraints();
gcon.fill = GridBagConstraints.HORIZONTAL;
gcon.gridy=0;
gcon.gridx=0;
gcon.gridheight=1;
gcon.gridwidth = 4;
gbl.setConstraints(b1, gcon);
add(b1);
gcon.fill = GridBagConstraints.HORIZONTAL;
gcon.gridy=1;
gcon.gridx=0;
gcon.gridheight=2;
gcon.gridwidth = 1;
gbl.setConstraints(t1, gcon);
add(t1);
gcon.fill = GridBagConstraints.HORIZONTAL;
Canvas c = new Canvas();
c.setBackground(Color.BLUE);
//c.setVisible(true);
c.setSize(300,200);
gcon.gridy=1;
gcon.gridx=1;
gcon.gridheight=2;
gcon.gridwidth = 2;
gcon.gridy=1;
gbl.setConstraints(c, gcon);
add(c);
gcon.fill = GridBagConstraints.HORIZONTAL;
gcon.gridy=1;
gcon.gridx=3;
gcon.gridheight=2;
gcon.gridwidth = 1;
gcon.gridy=1;gbl.setConstraints(t2, gcon);
add(t2);
//add(//b5);
}
    

}

class GridBagLayoutDemo {
    public static void main(String args[]) {
        MyFrame f = new MyFrame();
    }
}
