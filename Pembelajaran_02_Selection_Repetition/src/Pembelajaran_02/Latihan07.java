package Pembelajaran_02;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resto resto = new Resto(scanner);
        String ulang;
        
        do {
            resto.chooseMenu();
            System.out.print("Apakah anda akan memesan kembali ? (y/n) ");
            ulang = scanner.next();
        } while (ulang.equalsIgnoreCase("y"));
        
        System.out.println("Terimakasih telah memesan.");
        scanner.close();
    }
}
