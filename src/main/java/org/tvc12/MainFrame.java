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

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Application");
        MainFrame mainFrame = new MainFrame();
        frame.setContentPane(mainFrame.mainPanel);
        initEvent(mainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void initEvent(MainFrame mainFrame) {
        JSlider sliderZ = mainFrame.sliderZ;
        JSlider sliderY = mainFrame.sliderY;
        JSlider sliderX = mainFrame.sliderX;
        CubePanel viewPanel = mainFrame.viewPanel;
        JButton resetButton = mainFrame.resetButton;

        sliderX.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                viewPanel.getGeometry().rotateX(sliderX.getValue() / 180.0);
                viewPanel.repaint();
            }
        });
        sliderY.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                viewPanel.getGeometry().rotateY(sliderY.getValue() / 180.0);
                viewPanel.repaint();

            }
        });
        sliderZ.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                viewPanel.getGeometry().rotateZ(sliderZ.getValue() / 180.0);
                viewPanel.repaint();
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
}
