package abstrachInterface;

public class Segitiga implements BangunDatar{
	
	@Override
	 public void karakter() {
		System.out.println("Luas= alas * tinggi/2 | Kel= alas + 2 sisi miring | 3 Sisi");
	 }
	
	public void draw() {
		System.out.println("Menggambar Segitiga");
	}
}
