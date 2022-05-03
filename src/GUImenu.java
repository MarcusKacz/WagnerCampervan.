import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javafx.application.Application.launch;


public class GUImenu extends Main implements ActionListener {

    public static Class<? extends Application> mainMenu(){


        JFrame frontPanel =new JFrame("Wagner");
        JButton menuButton=new JButton("Create Booking");

        menuButton.addActionListener(e -> launch(booking.jframeMenu()));

        menuButton.addActionListener(e -> {frontPanel.setVisible(false);});

        menuButton.setBounds(150,100,200,30);



        frontPanel.add(menuButton);

        frontPanel.setSize(500,1000);
        frontPanel.setLayout(null);
        frontPanel.setVisible(true);




    return null;

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
