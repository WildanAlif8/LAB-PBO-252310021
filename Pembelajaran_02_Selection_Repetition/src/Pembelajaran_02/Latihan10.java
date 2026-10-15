package Pembelajaran_02;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long PIN = 252310021;
        long saldo = 1000000;

        long inputPin;
        do {
            System.out.print("Masukkan PIN: ");
            inputPin = scanner.nextLong();
            if (inputPin != PIN) {
                System.out.println("PIN salah, silakan coba lagi.");
            }
        } while (inputPin != PIN);

        String lanjut;
        do {
            System.out.println();
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: Rp " + String.format("%,d", saldo).replace(',', '.') + ",-");
                    break;
                case 2:
                    System.out.print("Masukkan nominal setor tunai: ");
                    long setor = scanner.nextLong();
                    saldo += setor;
                    System.out.println("Saldo anda: Rp " + String.format("%,d", saldo).replace(',', '.') + ",-");
                    break;
                case 3:
                    System.out.print("Masukkan nominal tarik tunai: ");
                    long tarik = scanner.nextLong();
                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Saldo anda: Rp " + String.format("%,d", saldo).replace(',', '.') + ",-");
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }

            System.out.print("Apakah anda ingin melanjutkan transaksi ? (y/n) ");
            lanjut = scanner.next();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("Terimakasih.");
        scanner.close();
    }
}