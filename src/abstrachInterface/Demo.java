package abstrachInterface;

public class Demo {
	public static void main(String[] args) {
	Lingkaran l = new Lingkaran();
	System.out.println("Lingkaran");
	l.draw();
	l.karakter();
	
	Persegi p = new Persegi();
	System.out.println("Persegi");
	p.draw();
	p.karakter();
	
	Segitiga s = new Segitiga();
	System.out.println("Segitiga");
	s.draw();
	s.karakter();
	
	}
}
