import java.awt.*;
import javax.swing.*;

public class MessageView extends JPanel {
    public MessageView() {
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Message");
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label, BorderLayout.NORTH);

        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setHorizontalAlignment(JLabel.CENTER);
        add(helloLabel, BorderLayout.CENTER);

        JPanel checkboxPanel = new JPanel(new GridLayout(1, 4));
        checkboxPanel.add(new JCheckBox("Angry"));
        checkboxPanel.add(new JCheckBox("SMS"));
        checkboxPanel.add(new JCheckBox("Binary"));
        checkboxPanel.add(new JCheckBox("Encrypted"));
        add(checkboxPanel, BorderLayout.SOUTH);

        JLabel newMessageLabel = new JLabel("New Message");
        newMessageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(newMessageLabel);
    }
}