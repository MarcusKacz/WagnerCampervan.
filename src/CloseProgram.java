import javafx.application.Application;

import javax.swing.*;

public class CloseProgram {

    static JFrame closePanel;

    public static Class<? extends Application> closeProgramJFrame() {

        closePanel = new JFrame("Wagner");

        closePanel.setSize(350, 200);
        closePanel.setLayout(null);
        closePanel.setVisible(true);

        JButton yesButton = new JButton("Yes");
        yesButton.setBounds(50,120,100,25);

        JButton noButton = new JButton("No");
        noButton.setBounds(200,120,100,25);

        JLabel closeMessage = new JLabel("TEST");



        closePanel.add(yesButton);
        closePanel.add(noButton);
        closePanel.add(closeMessage);

        return null;
    }

}
