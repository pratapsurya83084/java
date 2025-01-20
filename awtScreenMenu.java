import java.awt.*;
import java.awt.event.*;

public class awtScreenMenu extends Frame {
    
    // Constructor to setup the UI components
    public awtScreenMenu() {
        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create a menu
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        // Create menu items and add them to the file menu
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        // Add a submenu for the 'Edit' menu
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar for the frame
        setMenuBar(menuBar);

        // Create a subpanel (a simple panel)
        Panel subPanel = new Panel();
        subPanel.setBackground(Color.lightGray);  // Set background color of the panel
        subPanel.setBounds(50, 100, 300, 200);    // Set size and position of the panel

        // Add a label to the panel
        Label label = new Label("This is a subpanel");
        subPanel.add(label);  // Add label to the panel

        // Add the panel to the frame
        add(subPanel);

        // Setup the frame (main window)
        setTitle("AWT MenuBar and Panel Example");
        setSize(400, 400);      // Set size of the frame
        setLayout(null);        // Use absolute layout (no layout manager)
        setVisible(true);       // Make the frame visible
        
        // Handle the window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();  // Close the frame when the close button is clicked
            }
        });
    }

    public static void main(String[] args) {
        // Create an instance of the class to display the UI
        new awtScreenMenu();
    }
    
}
