import java.awt.*;

class myFrame {
    public static void main(String[] args) {
        Frame f = new Frame("Hello Frame");
        f.setSize(1000, 1000);
        f.setVisible(true);
        f.setBackground(Color.RED);
        
        Button b1 = new Button("Submit");
        f.add(b1);
    }
}
