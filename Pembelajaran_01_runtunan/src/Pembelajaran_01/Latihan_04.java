package Pembelajaran_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String NAMA_TOKO = "TOKO SERBAGUNA IBIK";
        final String NAMA_PRODUK = "ROTI ENAK";
        final double HARGA = 6300;
        final double DISKON = 0.05;

        System.out.print("Masukan jumlah produk yang dibeli : ");
        int jumlah = scanner.nextInt();

        double total = jumlah * HARGA;

        double potongan = 0;

        if (jumlah % 3 == 0) {
            potongan = total * DISKON;
        }

        double subTotal = total - potongan;

        LocalDateTime sekarang = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println();
        System.out.println(NAMA_TOKO);
        System.out.println("Masukan jumlah produk yang dibeli : " + jumlah);
        System.out.println(sekarang.format(format));
        System.out.println();
        System.out.println("ITEM\t\tQTY\tHARGA\t\tTOTAL");
        System.out.printf("%-15s %-8d Rp %-10.0f Rp %.0f%n",
                NAMA_PRODUK,
                jumlah,
                HARGA,
                total);
        
        System.out.printf("Diskon    : Rp %.0f%n", potongan);
        System.out.printf("Sub Total : Rp %.0f%n", subTotal);

        scanner.close();
    }
}