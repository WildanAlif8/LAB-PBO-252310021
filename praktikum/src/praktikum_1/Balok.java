package praktikum_1;

import java.util.Scanner;

public class Balok {
    public double panjang;
    public double lebar;
    public double tinggi;
    
    public double getVolume() {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Menghitung Volume Balok");
        Balok balok = new Balok(); 
        
        System.out.print("Masukkan Panjang balok: ");
        balok.panjang = input.nextDouble();
        
        System.out.print("Masukkan Lebar balok: ");
        balok.lebar = input.nextDouble();
        
        System.out.print("Masukkan Tinggi balok: ");
        balok.tinggi = input.nextDouble();
        
        System.out.println("Volume balok: " + balok.getVolume());
    }
}
