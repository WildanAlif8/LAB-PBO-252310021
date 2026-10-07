package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Usia : ");
        int usia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Firstname : ");
        String firstname = scanner.nextLine();

        System.out.print("Masukkan Lastname : ");
        String lastname = scanner.nextLine();

        System.out.print("Masukkan NPM : ");
        String npm = scanner.nextLine();

        String hasil = String.valueOf(usia)
                .concat(firstname)
                .concat(lastname)
                .concat(npm);

        System.out.println("\nHasil CONCAT : " + hasil);

        scanner.close();
    }
}
