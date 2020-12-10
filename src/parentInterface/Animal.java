package parentInterface;

public class Animal {
	private int legs;
	private String eat;
	private String walk;
	

	public Animal(int a, String b, String c) {
		super();
		this.legs = a;
		this.eat = b;
		this.walk = c;
	}
	
	public String getDetail() {
		return "kakinya " + legs + " tipe makan " + eat + " cara gerak "  + walk;
	}
	
}
