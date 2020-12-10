package tugasInterface;

public class Student2 extends Person implements baseInterface {
	@Override
	public void studentRegistration() {
		Student2 s1 = new Student2();
		s1.setFname("Corina");
		s1.setLname("Angel");
		s1.setDomisili("Scientia Park");
		s1.setIdNumber(105216002);
		s1.setSemester(144);
		s1.getDetailPerson();
		
	}
	
	public void learningPlan() {
		Student2 s1 = new Student2();
		s1.setCourses(2);
	}

}
