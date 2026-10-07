package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_03 {

    static final double PHI = 3.14;

    static double luasKerucut(double r, double s) {
        return PHI * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        return (1.0 / 3.0) * PHI * r * r * t;
    }

    static double luasTabung(double r, double t) {
        return 2 * PHI * r * (r + t);
    }

    static double volumeTabung(double r, double t) {
        return PHI * r * r * t;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PERHITUNGAN KERUCUT");

        System.out.print("Masukkan jari-jari kerucut : ");
        double rKerucut = scanner.nextDouble();

        System.out.print("Masukkan tinggi kerucut : ");
        double tKerucut = scanner.nextDouble();

        double s = Math.sqrt(
                (rKerucut * rKerucut) +
                (tKerucut * tKerucut)
        );

        double luasK = luasKerucut(rKerucut, s);
        double volumeK = volumeKerucut(rKerucut, tKerucut);

        System.out.println("Garis pelukis       : " + s);
        System.out.println("Luas permukaan      : " + luasK);
        System.out.println("Volume              : " + volumeK);

        System.out.println("\n PERHITUNGAN TABUNG");

        System.out.print("Masukkan jari-jari tabung : ");
        double rTabung = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung : ");
        double tTabung = scanner.nextDouble();

        double luasT = luasTabung(rTabung, tTabung);
        double volumeT = volumeTabung(rTabung, tTabung);

        System.out.println("Luas permukaan      : " + luasT);
        System.out.println("Volume              : " + volumeT);

        scanner.close();
    }
}
