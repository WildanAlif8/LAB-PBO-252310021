package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu Celcius : ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;
        double reamur = celcius * 4 / 5;
        double kelvin = celcius + 273.15;

        System.out.println("\nHASIL KONVERSI SUHU");
        System.out.println("Celcius     : " + celcius + " °C");
        System.out.println("Fahrenheit  : " + fahrenheit + " °F");
        System.out.println("Reamur      : " + reamur + " °R");
        System.out.println("Kelvin      : " + kelvin + " K");

        scanner.close();
    }
}