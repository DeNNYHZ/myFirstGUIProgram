package me.dennyhz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public Main() {

        JFrame frame = new JFrame();

        JButton button = new JButton("Click Here");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " +count);
    }
}