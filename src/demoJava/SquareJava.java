package demoJava;

public class SquareJava {
	 
	public void myMethod(int max) {
		for(int i=1;i<=max;i++){
			   for(int j=1;j<=max;j++){
			    System.out.print(" * ");
			   }
			   System.out.println(" ");
			  }
	}
	
	public static void main(String[] args) {
		SquareJava sq = new SquareJava();
		sq.myMethod(4);
	 }

}
