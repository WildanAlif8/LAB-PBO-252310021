package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap : ");
        String nama = scanner.nextLine();

        String hasil = nama
                .replace('a', 'X')
                .replace('i', 'X')
                .replace('u', 'X')
                .replace('e', 'X')
                .replace('o', 'X')
                .replace('A', 'X')
                .replace('I', 'X')
                .replace('U', 'X')
                .replace('E', 'X')
                .replace('O', 'X');

        System.out.println("Hasil : " + hasil);

        scanner.close();
    }
}