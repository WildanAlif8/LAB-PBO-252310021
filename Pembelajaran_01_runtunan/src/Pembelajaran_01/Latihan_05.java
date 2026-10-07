package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat : ");
        String teks = scanner.nextLine();

        String hasil = teks.toUpperCase();

        System.out.println("Hasil : " + hasil);

        scanner.close();
    }
}