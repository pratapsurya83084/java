import javax.swing.*;
import java.awt.event.*;

public class SubjectSelector {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("T.Y.B.Sc. (Comp. Sci) Subjects");

        // Create a label for instructions
        JLabel label = new JLabel("Select a subject:");
        label.setBounds(50, 50, 150, 20);

        // Create a combo box with subjects
        String[] subjects = { "Operating Systems", "Data Structures", "Software Engineering", 
                              "Computer Networks", "Database Management Systems", "Web Technology" };
        JComboBox<String> comboBox = new JComboBox<>(subjects);
        comboBox.setBounds(50, 80, 200, 30);

        // Create a text field to display the selected subject
        JTextField textField = new JTextField();
        textField.setBounds(50, 130, 200, 30);
        textField.setEditable(false); // Make the text field non-editable

        // Add action listener to the combo box to handle selections
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected subject and display it in the text field
                String selectedSubject = (String) comboBox.getSelectedItem();
                textField.setText(selectedSubject);
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(comboBox);
        frame.add(textField);

        // Set frame properties
        frame.setSize(400, 300);          // Set window size
        frame.setLayout(null);            // No layout manager (absolute positioning)
        frame.setVisible(true);           // Make the window visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the window when "X" is clicked
    }
}
