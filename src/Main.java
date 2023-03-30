import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MessageView Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        // Add the MessageView panel to the JFrame and show it
        frame.add(new MessageView());
        frame.setVisible(true);
    }
}