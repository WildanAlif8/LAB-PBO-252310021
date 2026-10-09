package Praktikum_2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		Segitiga segitiga = new Segitiga(a, b, c);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan sisi a: ");
		a = scanner.nextInt();
		
		System.out.println("Masukkan sisi b: ");
		b = scanner.nextInt();
		
		System.out.println("Masukkan sisi c: ");
		c = scanner.nextInt();
		
		segitiga.a = a;
		segitiga.b = b;
		segitiga.c = c;
		
		if (segitiga.a * segitiga.a + segitiga.b * segitiga.b == segitiga.c * segitiga.c) {
			System.out.println("Segitiga Sempurna");
		} else {
			System.out.println("Segitiga Tidak Sempurna");
		}
		
		scanner.close();
	}
}
