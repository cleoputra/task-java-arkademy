package parentInterface;


	// Pig "implements" the Animal interface
	class Bird implements Birds {
	  public void legs() {
	    // The body of animalSound() is provided here
	    System.out.println("Sayap dan 2 kaki");
	  }
	  public void eat() {
	    // The body of sleep() is provided here
	    System.out.println("Karnivor");
	  }
	  public void walk() {
		    // The body of sleep() is provided here
		    System.out.println("Terbang");
		  }
	}

