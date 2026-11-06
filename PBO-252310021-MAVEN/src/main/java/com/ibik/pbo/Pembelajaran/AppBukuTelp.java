package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.*;

public class AppBukuTelp {

    static ArrayList<String> kolom = new ArrayList<>();
    static ArrayList<ArrayList<String>> bukuTelp = new ArrayList<>();

    static void tambahData(String nama, String alamat, String telp) {
        ArrayList<String> baris = new ArrayList<>();
        baris.add(nama);
        baris.add(alamat);
        baris.add(telp);
        bukuTelp.add(baris);
    }

    static void formTambah() {
        JTextField tfNama = new JTextField(20);
        JTextField tfAlamat = new JTextField(20);
        JTextField tfTelp = new JTextField(20);
        JPanel panel = new JPanel(new java.awt.GridLayout(0, 2, 5, 5));
        panel.add(new JLabel(kolom.get(0))); panel.add(tfNama);
        panel.add(new JLabel(kolom.get(1))); panel.add(tfAlamat);
        panel.add(new JLabel(kolom.get(2))); panel.add(tfTelp);

        int hasil = JOptionPane.showConfirmDialog(null, panel, "Form Isian Buku Telepon",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (hasil == JOptionPane.OK_OPTION) {
            if (tfNama.getText().trim().isEmpty() || tfAlamat.getText().trim().isEmpty() || tfTelp.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua field harus diisi!", "Error Info", JOptionPane.ERROR_MESSAGE);
            } else {
                tambahData(tfNama.getText(), tfAlamat.getText(), tfTelp.getText());
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan.");
            }
        }
    }

    static void tampilData() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.join(" | ", kolom)).append("\n");
        sb.append("----------------------------------------------------------------------").append("\n");
        int no = 1;
        for (ArrayList<String> baris : bukuTelp) {
            sb.append(no++).append(". ").append(String.join(" | ", baris)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Data Buku Telepon", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        kolom.add("Nama Lengkap");
        kolom.add("Alamat");
        kolom.add("No Telp");

        tambahData("Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210");
        tambahData("Isnan Mulia", "Jl.Manunggal, Bogor", "+62 819-3208-0875");
        tambahData("Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384");

        String[] menu = {"Tambah Data", "Lihat Data", "Keluar"};
        while (true) {
            int pilih = JOptionPane.showOptionDialog(null, "BUKU TELEPON", "Menu Utama",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            if (pilih == 0) formTambah();
            else if (pilih == 1) tampilData();
            else break;
        }
    }
}
