package tugasResto;

import java.util.Scanner;

import tugasResto.Menu;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Menu menu = new Menu();
		int choice;
		
		do {
			System.out.println();		
			System.out.println("Welcome to Resto Wild to the Rift");
			System.out.println("1. Order Menu in here!");
			System.out.println("2. Check Your Order");
			System.out.println("3. Pay Now");
			System.out.println("0. Exit");
			
			System.out.print("Select Menu: ");
			choice = input.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				 menu.menuInput();
				break;
			case 2:
				menu.bilPay();
				break;
			case 3:
				menu.printPay();
				break;
			
			default:
				System.out.print("Input 1 - 3, Thankyou!");
				break;
			}
		}
		while(choice != 0);
		input.close();
	}

}
