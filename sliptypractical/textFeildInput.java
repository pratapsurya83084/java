import java.awt.*;
import java.awt.event.*;

// Custom exception for login failure
class LoginException extends Exception {
    public LoginException(String message) {
        super(message);
    }
}


 class textFeildInput extends Frame implements ActionListener {
    Label userLabel, passLabel, msgLabel;
    TextField userField, passField;
    Button loginButton, clearButton;
    int attempts = 0;

    public textFeildInput() {
        // Set layout and create components
        setLayout(new FlowLayout());
        
        userLabel = new Label("Username:");
        userField = new TextField(20);

        passLabel = new Label("Password:");
        passField = new TextField(20);
        passField.setEchoChar('*');

        loginButton = new Button("Login");
        clearButton = new Button("Clear");
        msgLabel = new Label("");

        // Add components to frame
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginButton);
        add(clearButton);
        add(msgLabel);

        // Set action listeners
        loginButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Set frame properties
        setTitle("Login Screen");
        setSize(300, 200);
        setVisible(true);

        // Close window on clicking 'X'
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            try {
                validateLogin();
            } catch (LoginException ex) {
                msgLabel.setText(ex.getMessage());
            }
        } else if (e.getSource() == clearButton) {
            userField.setText("");
            passField.setText("");
            msgLabel.setText("");
        }
    }

    // Method to validate login
    public void validateLogin() throws LoginException {
        String username = userField.getText();
        String password = passField.getText();

        if (username.equals(password)) {
            msgLabel.setText("Login Successful!");
            attempts = 0;  // Reset attempts after successful login
        } else {
            attempts++;
            if (attempts >= 3) {
                msgLabel.setText("Login Failed! No more attempts.");
                loginButton.setEnabled(false);
                throw new LoginException("Exceeded login attempts.");
            } else {
                throw new LoginException("Incorrect Username or Password. Attempts left: " + (3 - attempts));
            }
        }
    }

    public static void main(String[] args) {
        new textFeildInput();
    }
}
