package praktikum_1;

public class Introduction {
	static Dog mydog = new Dog();
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		
		int angka1 = 10;
		int angka2 = 20;
		
		String nama = "OWO";
		
		int hasilTambah = angka1 + angka2;
		hasilTambah++;
		
		boolean pembanding = angka1 > angka2;
		boolean tesNama = nama == "OWO";
		
		boolean kondisional = (true || false) && (true & true);
		
		angka1 *= angka2;
		
		mydog.hungry();
		String name = "owo";
		mydog.puppyName(name);
	}
}
