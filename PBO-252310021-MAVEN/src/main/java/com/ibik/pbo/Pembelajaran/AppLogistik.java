package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {

    static final int HARGA_PER_100GR = 5000; 
    static final int HARGA_PER_10KM = 8000;  

    static ArrayList<String[]> pesanan = new ArrayList<>();
    static int counter = 1;


    static boolean konfirmasiKeluar() {
        int j = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        return j == JOptionPane.YES_OPTION;
    }

    static Integer bacaAngka(String pesan, String judul) {
        while (true) {
            String in = JOptionPane.showInputDialog(null, pesan, judul, JOptionPane.QUESTION_MESSAGE);
            if (in == null) {                   
                if (konfirmasiKeluar()) System.exit(0);
                return null;                        
            }
            try {
                int n = Integer.parseInt(in.trim());
                if (n <= 0) throw new NumberFormatException();
                return n;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukan angka", "Error Info", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    static void inputPesanan() {
        String nama = JOptionPane.showInputDialog(null, "Nama pengirim:", "Input Pesanan", JOptionPane.QUESTION_MESSAGE);
        if (nama == null) {
            if (konfirmasiKeluar()) System.exit(0);
            return;
        }
        if (nama.trim().isEmpty()) nama = "-";

        Integer berat = bacaAngka("Berat barang (gram):", "Input Pesanan");
        if (berat == null) return;
        Integer jarak = bacaAngka("Jarak tempuh (km):", "Input Pesanan");
        if (jarak == null) return;

        int unitBerat = (int) Math.ceil(berat / 100.0);
        int unitJarak = (int) Math.ceil(jarak / 10.0);
        int total = unitBerat * HARGA_PER_100GR + unitJarak * HARGA_PER_10KM;
        String resi = String.format("RESI%04d", counter++);

        pesanan.add(new String[]{resi, nama, String.valueOf(berat), String.valueOf(jarak), String.valueOf(total)});

        JOptionPane.showMessageDialog(null,
                "Pesanan berhasil!\n"
                + "No Resi    : " + resi + "\n"
                + "Biaya berat: " + unitBerat + " x Rp " + HARGA_PER_100GR + "\n"
                + "Biaya jarak: " + unitJarak + " x Rp " + HARGA_PER_10KM + "\n"
                + "TOTAL      : Rp " + total,
                "Info Pesanan", JOptionPane.INFORMATION_MESSAGE);
    }

    static void tracking() {
        if (pesanan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Silakan Input Pesanan terlebih dahulu.",
                    "Error Info", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String resi = JOptionPane.showInputDialog(null, "Masukkan nomor resi:", "Tracking", JOptionPane.QUESTION_MESSAGE);
        if (resi == null) {
            if (konfirmasiKeluar()) System.exit(0);
            return;
        }
        for (String[] p : pesanan) {
            if (p[0].equalsIgnoreCase(resi.trim())) {
                JOptionPane.showMessageDialog(null,
                        "No Resi : " + p[0] + "\nPengirim: " + p[1] + "\nBerat   : " + p[2] + " gr\n"
                        + "Jarak   : " + p[3] + " km\nTotal   : Rp " + p[4] + "\nStatus  : Sedang dalam pengiriman",
                        "Status Pengiriman", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Error Info", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        String[] menu = {"Input Pesanan", "Tracking Pesanan", "Keluar"};
        while (true) {
            int pilih = JOptionPane.showOptionDialog(null, "PT. Saraswati Indonesia Genetech - Jasa Logistik", "Menu Utama",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            if (pilih == 0) inputPesanan();
            else if (pilih == 1) tracking();
            else if (konfirmasiKeluar()) break;
        }
    }
}
