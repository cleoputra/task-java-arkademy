package parentInterface;

public class App {
	public static void main(String[] args) {
	Cat c = new Cat("Anggora", 4, "Omnivora", "Jalan Kaki");
	System.out.println(c.getDetail());

	  Bird b = new Bird();  // Create a Pig object
	  	b.walk();
	    b.eat();
	    b.legs();

	}
}
