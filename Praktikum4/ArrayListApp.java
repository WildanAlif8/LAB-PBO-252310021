
package Praktikum4;

import javax.swing.JOptionPane;

public class ArrayListApp {
    public static void main(String[] args) {
        String[] buku = new String[100];
        int jumlah = 0;
        int pilih = 0;

        while (pilih != 3) {
            String[] menu = {
                "Simpan Judul Buku",
                "Hapus Buku",
                "Lihat Semua Buku",
                "Keluar"
            };

            pilih = JOptionPane.showOptionDialog(
                null,
                "Pilih menu Inventory Buku",
                "INVENTORY BUKU",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]
            );

            switch (pilih) {
                case 0:
                    if (jumlah < buku.length) {
                        String judul = JOptionPane.showInputDialog(
                            "Masukkan judul buku:"
                        );

                        if (judul != null && !judul.trim().isEmpty()) {
                            buku[jumlah] = judul;
                            jumlah++;

                            JOptionPane.showMessageDialog(
                                null, "Buku berhasil disimpan."
                            );
                        }
                    } else {
                        JOptionPane.showMessageDialog(
                            null, "Tempat penyimpanan buku penuh."
                        );
                    }
                    break;

                case 1:
                    if (jumlah == 0) {
                        JOptionPane.showMessageDialog(
                            null, "Belum ada buku."
                        );
                    } else {
                        String daftar = "";

                        for (int i = 0; i < jumlah; i++) {
                            daftar += (i + 1) + ". " + buku[i] + "\n";
                        }

                        String nomor = JOptionPane.showInputDialog(
                            "Daftar Buku:\n" + daftar
                            + "\nNomor buku yang dihapus:"
                        );

                        if (nomor != null) {
                            try {
                                int n = Integer.parseInt(nomor);

                                if (n >= 1 && n <= jumlah) {
                                    for (int i = n - 1; i < jumlah - 1; i++) {
                                        buku[i] = buku[i + 1];
                                    }

                                    jumlah--;
                                    buku[jumlah] = null;

                                    JOptionPane.showMessageDialog(
                                        null, "Buku berhasil dihapus."
                                    );
                                } else {
                                    JOptionPane.showMessageDialog(
                                        null, "Nomor buku tidak ditemukan."
                                    );
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(
                                    null, "Masukkan nomor yang benar."
                                );
                            }
                        }
                    }
                    break;

                case 2:
                    if (jumlah == 0) {
                        JOptionPane.showMessageDialog(
                            null, "Belum ada buku."
                        );
                    } else {
                        String daftar = "";

                        for (int i = 0; i < jumlah; i++) {
                            daftar += (i + 1) + ". " + buku[i] + "\n";
                        }

                        JOptionPane.showMessageDialog(
                            null,
                            "DAFTAR BUKU\n\n" + daftar
                            + "\nJumlah buku: " + jumlah
                        );
                    }
                    break;

                case 3:
                case -1:
                    pilih = 3;
                    JOptionPane.showMessageDialog(
                        null, "Program selesai."
                    );
                    break;
            }
        }
    }
}
