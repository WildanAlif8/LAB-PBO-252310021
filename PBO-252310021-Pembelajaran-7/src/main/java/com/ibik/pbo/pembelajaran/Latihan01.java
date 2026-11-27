package com.ibik.pbo.pembelajaran;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Latihan01 extends JFrame {

    public Latihan01() {
        setTitle("Latihan 01");
        setSize(300, 120);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));
        generateUI();
    }

    private void generateUI() {
        JButton btnHalo = new JButton("ハロー");
        JButton btnEveryone = new JButton("ทุกคน");
        JButton btnIbik = new JButton("IBIK");

        btnHalo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    null,
                    "ハロー is a word for 'Hello'",
                    "You just click ハロー",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        btnEveryone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    null,
                    "ทุกคน is a word for 'Everyone'",
                    "You just click ทุกคน",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        btnIbik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    null,
                    "IBIK is an acronym for 'Institute Bisnis dan Informatika Kesatuan'",
                    "You just click IBIK",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        add(btnHalo);
        add(btnEveryone);
        add(btnIbik);
    }

    public static void main(String[] args) {
        Latihan01 frame = new Latihan01();
        frame.setVisible(true);
    }
}
