package bookrecommender.src;

import com.opencsv.exceptions.CsvValidationException;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class ToolBar extends JPanel implements ActionListener {

    JFrame utilityFrame;

    JButton UserButton;
    JComboBox<String> combo;
    JButton searchBook;
    JButton regButton;
    JButton logButton;
    JButton libraryButton;

    JPanel registerPanel;
    public JPanel LogInPanel;

    public ToolBar() {

        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setBackground(new Color(48, 111, 97));

        UserButton = new JButton("User");
        UserButton.addActionListener(this);

        regButton = new JButton("Register");
        regButton.addActionListener(this);

        logButton = new JButton("Log In");
        logButton.addActionListener(this);



        add(UserButton);
        add(logButton);
        add(regButton);






    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == regButton) {
            register reg = new register();

        } else if (e.getSource() == logButton) {
            LogInPanel logIn = new LogInPanel();
        }
    }


}
