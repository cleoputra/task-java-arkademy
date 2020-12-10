package tugasInterface;

public class Student1 extends Person implements baseInterface {
	
	@Override
	public void studentRegistration() {
		Student1 s1 = new Student1();
		s1.setFname("Angky");
		s1.setLname("HItro");
		s1.setDomisili("Pakubowono Residence");
		s1.setIdNumber(105216023);
		s1.setSemester(142);
		s1.getDetailPerson();
		
	}
	
	public void learningPlan() {
		Student1 s1 = new Student1();
		s1.setCourses(1);
	}
	
}
