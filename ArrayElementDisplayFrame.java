import java.awt.*;
import java.awt.event.*;

public class ArrayElementDisplayFrame extends Frame implements ActionListener {
    private TextField indexField;
    private TextField resultField;
    private int[] array;

    public ArrayElementDisplayFrame() {
        super("Array Element Display");
        setLayout(new FlowLayout());

        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000); // Filling the array with random integers
        }

        Label indexLabel = new Label("Enter Index:");
        indexField = new TextField(10);
        resultField = new TextField(20);
        resultField.setEditable(false);
        Button showButton = new Button("Show");
        showButton.addActionListener(this);

        add(indexLabel);
        add(indexField);
        add(showButton);
        add(resultField);

        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int index = Integer.parseInt(indexField.getText());
            if (index >= 0 && index < array.length) {
                resultField.setText(String.valueOf(array[index]));
            } else {
                resultField.setText("Out of Bound");
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }
}
 class Main {
    public static void main(String[] args) {
       ArrayElementDisplayFrame f= new ArrayElementDisplayFrame();
    }
}
