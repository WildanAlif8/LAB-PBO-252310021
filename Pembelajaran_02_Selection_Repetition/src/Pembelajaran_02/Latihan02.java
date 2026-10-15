package Pembelajaran_02;

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        long npm = scanner.nextLong();
        boolean prima = npm > 1;
        for (long i = 2; i * i <= npm; i++) {
            if (npm % i == 0) {
                prima = false;
                break;
            }
        }
        if (prima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
        }
        scanner.close();
    }
}
