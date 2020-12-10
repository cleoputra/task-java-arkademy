package inheritance;

public class Child extends Parent{
	public static int sK = 4;
	
	public void volumeKubus() {
		System.out.println("Volume Kubus " + sK*sK*sK + " cm^3");
	}
	
	public static void main(String[] args){
		Child ch = new Child();
		ch.luasPersegi(4);
        ch.luasSegitiga(6, 12);
        ch.volumeKubus();
		
	}
	
}
