// import java.awt.*;
// import java.awt.event.*;
// import java.lang.classfile.Label;

// class filed extends Frame {
//     public filed() {
//         // Set the frame title
//         setTitle("TextField Example");

//         // Create a label for name and password
//         Label l1 = new Label("Enter Name:");
//         Label l2 = new Label("Enter Password:");

//         // Create text fields for name and password
//         TextField nameField = new TextField();
//         TextField passwordField = new TextField();
//         passwordField.setEchoChar('*'); // Mask password input

//         // Set layout manager
//         setLayout(new GridLayout(3, 2));

//         // Add components to the frame
//         add(l1);
//         add(nameField);
//         add(l2);
//         add(passwordField);

//         // Set frame size, close operation, and visibility
//         setSize(400, 200);
//         setVisible(true);

//         // dispose close screnn

//         addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent we) {
//                 dispose();  // Close the frame when the close button is clicked
//             }
//         });
//     }

//     public static void main(String[] args) {
//         new filed();
//     }
// }

import java.awt.*;
import java.awt.event.*;

public class filed extends Frame {
    // constructor
    filed() {
        setTitle("input filed example");

        MenuBar menubar = new MenuBar();

        // create menu
        Menu filemenu = new Menu("File");
        Menu editmenu = new Menu("Edit");

        // create menuItems for file
        MenuItem openfile = new MenuItem("open");
        MenuItem newfile = new MenuItem("new");
        MenuItem savefile = new MenuItem("save");

        // add to file menu
        filemenu.add(openfile);
        filemenu.add(newfile);
        filemenu.add(savefile);

        // create item for edit
        MenuItem copyitem = new MenuItem("copy");
        MenuItem pasteitem = new MenuItem("paste");
        MenuItem cutitem = new MenuItem("cut");

        // add to edit menu
        editmenu.add(copyitem);
        editmenu.add(pasteitem);
        editmenu.add(cutitem);



        // menu add to menubar
        menubar.add(filemenu);
        menubar.add(editmenu);

        // filemenu.add(menubar);
        // editmenu.add(menubar);

        setMenuBar(menubar);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new filed();
    }

}