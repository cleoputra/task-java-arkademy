package scannerInherit;

public class Parent {

	public void luasPersegi(int sisi) {
		System.out.println("Luas Persegi " + sisi * sisi + " cm^2");
	}
	
	public void luasSegitiga(int alas, int tinggi) {
		System.out.println("Luas Segitiga " + alas * tinggi/2 + " cm^2"); 
	}
	
}
