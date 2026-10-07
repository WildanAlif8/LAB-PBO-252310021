package Pembelajaran_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan_10 {

    static Students student = new Students();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String NAMA_TOKO = "TOKO SERBAGUNA IBIK";
        final String NAMA_PRODUK = "ROTI ENAK";
        final double HARGA = 6300;
        final double DISKON = 0.05;


        System.out.println(" DATA MEMBER");

        System.out.print("Masukkan NPM Member : ");
        Integer npm = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Nama Member : ");
        String fullname = scanner.nextLine();

        System.out.print("Masukkan Class Name : ");
        String className = scanner.nextLine();

        System.out.print("Masukkan Semester : ");
        Integer semester = scanner.nextInt();

        System.out.print("Masukkan GPA : ");
        Float gpa = scanner.nextFloat();

        student.getNPM(npm);
        student.getFullname(fullname);
        student.getClassName(className);
        student.getSemester(semester);
        student.getGPA(gpa);

        System.out.print("\nMasukan jumlah produk yang dibeli : ");
        int jumlah = scanner.nextInt();

        double total = jumlah * HARGA;

        double potongan = 0;

        if (jumlah % 3 == 0) {
            potongan = total * DISKON;
        }

        double subTotal = total - potongan;

        LocalDateTime sekarang = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        // Cetak kwitansi
        System.out.println();
        System.out.println("==================================================");
        System.out.println(NAMA_TOKO);
        System.out.println("==================================================");
        System.out.println(sekarang.format(format));
        System.out.println();
        System.out.println("ITEM\t\tQTY\tHARGA\t\tTOTAL");
        System.out.println("==================================================");

        System.out.printf("%-15s %-8d Rp %-10.0f Rp %.0f%n",
                NAMA_PRODUK,
                jumlah,
                HARGA,
                total);

        System.out.println("--------------------------------------------------");
        System.out.printf("Diskon    : Rp %.0f%n", potongan);
        System.out.printf("Sub Total : Rp %.0f%n", subTotal);

        // Nama member dari class Students
        System.out.println("Member Name : " + student.Fullname);

        System.out.println("==================================================");

        scanner.close();
    }
}
