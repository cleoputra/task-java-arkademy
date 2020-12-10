package tugasIntModif;
import java.util.Scanner;
import java.util.ArrayList;

public class Student extends Person implements BaseInterface{
	private int nim, credit, totalCredit;
	private String courseName, lecturer, room;
	
	Scanner input = new Scanner(System.in);
	ArrayList<Student> course = new ArrayList<>();
	
	public Student() {
	}
	
	public Student(String courseName, int credit, String lecturer, String room) {
		super();
		this.courseName = courseName;
		this.credit = credit;
		this.lecturer = lecturer;
		this.room = room;
	}

	public int getNim() {
		return nim;
	}

	public void setNim(int nim) {
		this.nim = nim;
	}

	public int getCredit() {
		return credit;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getLecturer() {
		return lecturer;
	}

	public String getRoom() {
		return room;
	}

	@Override
	public void studentRegistration() {
		System.out.println("--- Print Student Data ---");
		
		if(getNim() != 0) {
			System.out.println("NIM		: " + getNim());
			
			if(totalCredit >= 144) {
				System.out.println("Fullname	: " + getFullName() + " S.Kom");
			} else {
				System.out.println("Fullname	: " + getFullName());
			}
			
			System.out.println("Address		: " + getAddress());
			System.out.println("Credits		: " + totalCredit);
		} else {
			System.out.println("No Data!");
		}
	}
	
	@Override 
	public void learningPlan() {
		System.out.println("--- Print Study Plan ---");
		
		if(totalCredit != 0) {
			for(int i = 0; i < course.size(); i++) {
				System.out.println("\nCourse " + (i+1));
				System.out.println("Course Name: " + course.get(i).getCourseName());
				System.out.println("Credit: " + course.get(i).getCredit());
				System.out.println("Lecturer: " + course.get(i).getLecturer());
				System.out.println("Room: " + course.get(i).getRoom());
			}
		}
		else {
			System.out.println("No Data!");
		}
	}
	
	public void studentInput() {
		System.out.println("### Input Student Data ###");
		System.out.println("NIM		: ");
		setNim(input.nextInt());
		System.out.println("First Name:		");
		setFname(input.next());
		System.out.println("Last Name:		");
		setLname(input.next());
		System.out.println("Address:		");
		setAddress(input.next());
		System.out.println();
	}
	
	public void courseInput() {
		System.out.println("--- Input Study Data ---");
		System.out.println("Number of Course		: ");
		int countData = input.nextInt();
		
		for (int i=0; i < countData; i++) {
			System.out.println("\nCourse: " + (i+1));
			
			System.out.println("Course Name: ");
			courseName = input.next();
			System.out.println("Credit: ");
			credit = input.nextInt();
			System.out.println("Lecturer: ");
			lecturer= input.next();
			System.out.println("Room: ");
			room = input.next();
			
			course.add(new Student(courseName, credit, lecturer, room));
			totalCredit += credit;
		}
		System.out.println();
		}
}
