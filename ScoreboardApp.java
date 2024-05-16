import java.awt.*;
import java.awt.event.*;

public class ScoreboardApp extends Frame implements ActionListener {
    private int redScore = 0;
    private int blueScore = 0;
    private Label redLabel;
    private Label blueLabel;

    public ScoreboardApp() {
        setTitle("Scoreboard");
        setSize(300, 150);
        setLayout(new FlowLayout( 2));

        Label titleLabel = new Label("Scoreboard");
        titleLabel.setAlignment(Label.CENTER);
        add(titleLabel);

        Label redLabel = new Label("Red Team: 0");
        redLabel.setAlignment(Label.CENTER);
        add(redLabel);

        Button redButton = new Button("Red Score");
        redButton.addActionListener(this);
        add(redButton);

       Label blueLabel = new Label("Blue Team: 0");
        blueLabel.setAlignment(Label.CENTER);
        add(blueLabel);

        Button blueButton = new Button("Blue Score");
        blueButton.addActionListener(this);
        add(blueButton);

        Button resetButton = new Button("Reset");
        resetButton.addActionListener(this);
        add(resetButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Red Score")) {
            redScore++;
        } else if (command.equals("Blue Score")) {
            blueScore++;
        } else if (command.equals("Reset")) {
            redScore = 0;
            blueScore = 0;
        }

        redLabel.setText("Red Team: " + redScore);
        blueLabel.setText("Blue Team: " + blueScore);
    }

    public static void main(String[] args) {
        ScoreboardApp app = new ScoreboardApp();
        app.setVisible(true);
    }
}
