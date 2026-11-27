package com.ibik.pbo.Pembelajaran;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Latihan01 extends JFrame {

    public Latihan01() {
        // Pengaturan dasar JFrame
        setTitle("Latihan 01");
        setSize(300, 120);
        setLocationRelativeTo(null); // Posisi jendela di tengah layar
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Menggunakan FlowLayout agar tombol tersusun rapi mengikuti lebar jendela
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));

        // Memanggil method untuk membuat komponen UI
        generateUI();
    }

    private void generateUI() {
        // 1. Membuat 3 buah JButton sesuai teks pada gambar
        JButton btnHalo = new JButton("ハロー");
        JButton btnEveryone = new JButton("ทุกคน");
        JButton btnIbik = new JButton("IBIK");

        // 2. Menambahkan aksi klik (ActionListener) pada masing-masing tombol
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

        // 3. Menambahkan semua tombol ke dalam Frame
        add(btnHalo);
        add(btnEveryone);
        add(btnIbik);
    }

    public static void main(String[] args) {
        // Menjalankan aplikasi
        Latihan01 frame = new Latihan01();
        frame.setVisible(true);
    }
}
