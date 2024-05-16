import java.awt.*;
import java.awt.event.*;

public class Figuredrawer extends Frame implements ItemListener {

    private CheckboxGroup checkboxGroup;
    private Canvas canvas;

    public Figuredrawer() {
        checkboxGroup = new CheckboxGroup();
        Checkbox rectangleCheckbox = new Checkbox("Rectangle", checkboxGroup, false);
        Checkbox circleCheckbox = new Checkbox("Circle", checkboxGroup, false);

        canvas = new Canvas();
        canvas.setSize(300, 300);

        setLayout(new FlowLayout());
        add(rectangleCheckbox);
        add(circleCheckbox);
        add(canvas);

        rectangleCheckbox.addItemListener(this);
        circleCheckbox.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setSize(400, 400);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        Checkbox selectedCheckbox = checkboxGroup.getSelectedCheckbox();
        if (selectedCheckbox.getLabel().equals("Rectangle")) {
            drawRectangle();
        } else if (selectedCheckbox.getLabel().equals("Circle")) {
            drawCircle();
        }
    }

    private void drawRectangle() {
        Graphics g = canvas.getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 200, 150);
    }

    private void drawCircle() {
        Graphics g = canvas.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(100, 100, 150, 150);
    }

    public static void main(String[] args) {
        new Figuredrawer();
    }
}
