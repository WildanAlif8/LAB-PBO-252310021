package praktikum_1;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        TANAH tanahWilip = new TANAH();

        System.out.println(" Program Menghitung Harga Total Tanah ");
        System.out.print("Masukkan luas tanah (m2): ");
        
        tanahWilip.luas = input.nextDouble();

        System.out.println("Harga total tanah Wildan Alif adalah: Rp. " + tanahWilip.getHargaTotal());
    }
}
