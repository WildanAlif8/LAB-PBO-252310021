package Pembelajaran_02;

import java.util.Scanner;

public class Resto {
    private Long harga;
    private Scanner scanner;

    public Resto(Scanner scanner) {
        this.scanner = scanner;
    }

    public void chooseMenu() {
        System.out.println("Menu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Masukkan pilihan menu (1-3): ");
        
        int pilihan = scanner.nextInt();
        this.harga = getPrices(pilihan);
        
        if (pilihan == 1) {
            System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + this.harga + ",-");
        } else if (pilihan == 2) {
            System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + this.harga + ",-");
        } else if (pilihan == 3) {
            System.out.println("Anda memesan Soto Ayam dengan harga Rp " + this.harga + ",-");
        } else {
            System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    private Long getPrices(int menuTerpilih) {
        if (menuTerpilih == 1) {
            return 22000L;
        } else if (menuTerpilih == 2) {
            return 15000L;
        } else if (menuTerpilih == 3) {
            return 25000L;
        } else {
            return 0L;
        }
    }
}
