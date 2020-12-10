package tugasIntModif;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Student student = new Student();
		int choice;
		
		do {
			System.out.println("Menu");
			System.out.println("1. Input Student Data");
			System.out.println("2. Input Study Plan");
			System.out.println("3. Print Student Data");
			System.out.println("4. Print Study Plan");
			System.out.println("5. Print Student and Study Plan");
			System.out.println("0. Exit");
			
			System.out.print("Select Menu: ");
			choice = input.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				student.studentInput();
				break;
			case 2:
				student.courseInput();
				break;
			case 3:
				student.studentRegistration();
				break;
			case 4:
				student.learningPlan();
				break;
			case 5:
				student.studentRegistration();
				student.learningPlan();
				break;
			default:
				System.out.print("Input 1 - 5, Terima kasih!");
				break;
			}
		}
		while(choice != 0);
		input.close();
	}
}
