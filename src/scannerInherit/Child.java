package scannerInherit;
import java.util.Scanner;

public class Child extends Parent{
	
	
	public void volumeKubus(int sK) {
		System.out.println("Volume Kubus " + sK*sK*sK + " cm^3");
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Child ch = new Child();
		System.out.println("Volume Kubus");
		System.out.print("Masukan sisi Kubus: ");
		int inputSisi = input.nextInt();
		ch.volumeKubus(inputSisi);
		
		System.out.println("Luas Segitiga");
		System.out.print("Masukan Alas: ");
		int inputAlas = input.nextInt();
		System.out.print("Masukan Tinggi: ");
		int inputTinggi= input.nextInt();
		ch.luasSegitiga(inputAlas, inputTinggi);
		
		System.out.println("Luas Persegi");
		System.out.print("Masukan sisi Persegi: ");
		int inputSisiPers = input.nextInt();
		ch.luasPersegi(inputSisiPers);
		
	}
	
}
