package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel {
    public Panel() {

        Font font = new Font("Arrial", Font.BOLD, 20);

        JButton jButton = new JButton("Сгенерировать номера");
        jButton.setFont(font);
        add(jButton);

        TextField textField = new TextField("+7 (999)0000000");
        textField.setFont(font);
        add(textField);

        //ButtonAction buttonAction = new ButtonAction(jButton);
        //jButton.addActionListener(buttonAction);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setText(generateNumber());
            }
        });

        setVisible(true);
    }

    public String generateNumber() {
        Random random = new Random();

        String number = "";
        number += "+7";
        number += "(999)";
        number += random.nextInt(10);
        number += random.nextInt(10);
        number += random.nextInt(10);
        number += random.nextInt(10);
        number += random.nextInt(10);
        number += random.nextInt(10);

        return number;
    }
}
