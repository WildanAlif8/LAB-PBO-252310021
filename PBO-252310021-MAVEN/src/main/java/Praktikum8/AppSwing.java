package Praktikum8;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AppSwing {
    AppSwing() {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setTitle("Pbo maven");

        // frame.setResizable(false);
        // JLabel label = new JLabel("wildan ganteng");
        // frame.add(label);


        // frame.pack();
        frame.setLocationRelativeTo(null);
        generateUI(frame);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    };

    public static void main(String[] args) {
        
        new AppSwing();
    }

    private void  generateUI(JFrame frame) {
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        frame.setLayout(new FlowLayout());

        frame.add(button1); frame.add(button2);
        frame.add(button3); frame.add(button4);

    }
}
