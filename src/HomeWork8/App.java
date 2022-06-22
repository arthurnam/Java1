package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {

    static int counter = 0;

    public App() {
        setTitle("My first app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        setResizable(false);

        add(new Panel(), BorderLayout.CENTER);

        setVisible(true);
    }


}
