package Pembelajaran_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        long npm = scanner.nextLong();

        int angka;
        do {
            System.out.print("Masukkan nilai faktor (minimal 20): ");
            angka = scanner.nextInt();
            if (angka < 20) {
                System.out.println("Nilai tidak boleh kurang dari 20.");
            }
        } while (angka < 20);

        ArrayList<Integer> faktor = new ArrayList<>();
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                faktor.add(i);
            }
        }

        boolean ascending = npm % 2 == 0;
        StringBuilder hasil = new StringBuilder();
        if (ascending) {
            for (int i = 0; i < faktor.size(); i++) {
                hasil.append(faktor.get(i));
                if (i < faktor.size() - 1) {
                    hasil.append(", ");
                }
            }
            System.out.println("ASC: Faktor " + angka + " adalah " + hasil);
        } else {
            for (int i = faktor.size() - 1; i >= 0; i--) {
                hasil.append(faktor.get(i));
                if (i > 0) {
                    hasil.append(", ");
                }
            }
            System.out.println("DESC: Faktor " + angka + " adalah " + hasil);
        }
        scanner.close();
    }
}
