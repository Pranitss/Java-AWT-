import java.awt.*;
import java.awt.event.*;

public class AWTExample {

    public static void main(String[] args) {
        // Create a frame (window) for the GUI
        Frame frame = new Frame("AWT Example");

        // Create a label to display text
        Label label = new Label("Enter your name:");

        // Create a text field to take input
        TextField textField = new TextField();

        // Create a button to trigger an action
        Button button = new Button("Submit");

        // Create a label to display the result
        Label resultLabel = new Label("");

        // Set the layout of the frame (use FlowLayout for simplicity)
        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        // Action listener for the button to display the entered name in the result label
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                resultLabel.setText("Hello, " + name + "!");
            }
        });

        // Set the size of the frame and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Handle window closing event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Exit the program when the window is closed
            }
        });
    }
}
