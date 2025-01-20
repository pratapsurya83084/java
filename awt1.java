import java.awt.*;
import java.awt.event.*;

// AWT Program
public class awt1 extends Frame implements ActionListener {

    Label label;
    Button button;

    // Constructor to set up the GUI
    public awt1() {
        // Create a label and button
        label = new Label("Press the button!");
        button = new Button("Click Me");

        // Set layout for the frame
        // setLayout(new FlowLayout());

        // Add label and button to the frame
        add(label);
        add(button);

        // Add action listener for the button
        button.addActionListener(this);

        // Set frame properties
        // setTitle("Simple AWT Program");
        setSize(300, 200);
        setVisible(true);

        // Close window on clicking the close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Handle button click events
    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    // Main method to run the program
    public static void main(String[] args) {
        new awt1();
    }
}
