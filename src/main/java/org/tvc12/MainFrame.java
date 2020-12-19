package org.tvc12;

import javax.swing.*;

public class MainFrame {

    private JPanel mainPanel;
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;
    private JPanel dropArea;
    private JButton resetButton;
    private CubePanel viewPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Application");
        frame.setContentPane(new MainFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
