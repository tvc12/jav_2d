package org.tvc12;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame {

    private JPanel mainPanel;
    private JSlider sliderZ;
    private JSlider sliderY;
    private JSlider sliderX;
    private JPanel dropArea;
    private JButton resetButton;
    private CubePanel viewPanel;

    public MainFrame() {
        sliderX.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println("sliderX:: "+ sliderX.getValue());
                viewPanel.getGeometry().routeX(sliderX.getValue());
            }
        });
        sliderY.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println("sliderX:: "+ sliderY.getValue());

                viewPanel.getGeometry().routeY(sliderY.getValue());
            }
        });
        sliderZ.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println("sliderX:: "+ sliderZ.getValue());

                viewPanel.getGeometry().routeZ(sliderZ.getValue());
            }
        });
        resetButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                sliderX.setValue(0);
                sliderY.setValue(0);
                sliderZ.setValue(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Application");
        frame.setContentPane(new MainFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
