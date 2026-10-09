package Praktikum_2;

import java.util.Scanner;

public class calculator {
    static double hitung(double x, double y, char operator) {
        switch (operator) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                if (y == 0) {
                    throw new Error ("Tidak boleh dibagi dengan nol");
                } return x / y;
                default:
                throw new Error("Operator Invalid");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Kalkulator Sederhana");
        
        double x, y;
        char operator, again = 'Y';
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("\nInput x: ");
            x = scanner.nextDouble();
            
            System.out.print("Input y: ");
            y = scanner.nextDouble();
            
            System.out.print("Input Operator: ");
            operator = scanner.next().charAt(0);
            
            double hasil = hitung(x, y, operator);
            System.out.println("Hasil: " + hasil);
            
            System.out.print("Ulang (Y/N): ");
            again = scanner.next().charAt(0);
            
        } while (Character.toUpperCase(again) == 'Y');
        
        System.out.println("Program selesai. Terima kasih!");
        scanner.close();
    }
}
