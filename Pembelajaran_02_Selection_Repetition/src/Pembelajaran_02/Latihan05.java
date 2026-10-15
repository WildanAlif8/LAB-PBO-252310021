package Pembelajaran_02;

import java.util.Scanner;

public class Latihan05 {
    static void cetakBaris(int n, int k) {
        for (int c = 0; c <= 2 * n; c++) {
            if (c < k || c > 2 * n - k) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        long npm = scanner.nextLong();
        System.out.print("Enter the number of row:");
        int n = scanner.nextInt();

        if (npm % 2 != 0) {
            int r = 1;
            while (r <= 2 * n) {
                int k = (r <= n) ? n - r + 1 : r - n;
                cetakBaris(n, k);
                r++;
            }
        } else {
            for (int r = 1; r <= 2 * n; r++) {
                int k = (r <= n) ? n - r + 1 : r - n;
                cetakBaris(n, k);
            }
        }
        scanner.close();
    }
}
