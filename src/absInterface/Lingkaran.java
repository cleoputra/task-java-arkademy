package absInterface;

public class Lingkaran extends BangunDatar implements ProjectINt {
	
	@Override
	public void bangunan() {
		Lingkaran l = new Lingkaran();
		System.out.println("Lingkaran");
		l.getBangunDatar(4, " Pi * r^2 ", " gambar lingkaran ");
	}
	
}
