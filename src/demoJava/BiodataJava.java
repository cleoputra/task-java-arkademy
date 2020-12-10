package demoJava;

public class BiodataJava {
	public String fname = "Ditto ";
	public String lname = " Percussion";
	public String domisili = "Bandung";
	public int tahunLahir = 1995;
	public String namaLengkap;

	public void myMethod() {
		namaLengkap = fname + lname;
		System.out.println(namaLengkap);
		
	}
	
	public static void main(String[] args) {
		BiodataJava bio = new BiodataJava();
		bio.myMethod();
		System.out.println(bio.domisili);
		System.out.println(bio.tahunLahir);
	}
}
