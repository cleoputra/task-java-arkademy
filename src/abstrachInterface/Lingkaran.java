package abstrachInterface;

public class Lingkaran implements BangunDatar{
	
	@Override
	 public void karakter() {
		System.out.println("Luas= Pi * r^2 | Kel= Pi * d | 1 Sisi");
	 }
	
	public void draw() {
		System.out.println("Menggambar Lingkaran");
	}
}
