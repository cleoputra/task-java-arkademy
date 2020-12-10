package tugasInterface;

public class Person {
	private String fname;
	private String lname;
	private String domisili;
	private int semester;
	private int idNumber;
	private int courses;
	
	
	public int getCourses() {
		return courses;
	}
	public void setCourses(int courses) {
		switch(courses) {
		case 1:
			System.out.println("Big Data");
			System.out.println("Dosen: Prof. Meredita S. , M. Koyimatu Ph.D");
			System.out.println("Ruang: 2403 & 2405");
		break;
		case 2:
			System.out.println("IT in Business & Management");
			System.out.println("Dosen: Erwin Setiawan M.M , Ade Irawan Ph.D");
			System.out.println("Ruang: 2503 & 2205");
		break;
		case 3:
			System.out.println("Mobile and Web Application");
			System.out.println("Dosen: Galang Dwi M.Kom , Tasmi Nurul Ph.D");
			System.out.println("Ruang: 2603 & 2805");
		break;
		default:
		    System.out.println("Kelar Belum Tersedia!");
		}
	}
	
	public int getIdNumber() {
		return idNumber;
	
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDomisili() {
		return domisili;
	}
	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}
	
	public Person(String fname, String lname, String domisili, int semester, int idNumber, int courses) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.domisili = domisili;
		this.semester  = semester;
		this.idNumber = idNumber;
		this.courses = courses;
	}
	
	public Person() {
		super();
	}
	
	
	public int getSemester() {
		return semester;
	}
	
	public void setSemester(int semester) {
//		switch(semester) {
//		case 1:
//			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname);
//			System.out.println("Semester 1 | 7 semester menuju sarjana");
//		break;
//		case 2:
//			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname);
//			System.out.println("Semester 2 | 6 semester menuju sarjana");
//		break;
//		case 3:
//			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname);
//			System.out.println("Semester 3 | 5 semester menuju sarjana");
//		break;
//		case 4:
//			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname);
//			System.out.println("Semester 4 | 4 semester menuju sarjana");
//		break;
//		case 5:
//			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname);
//			System.out.println("Semester 5 | 3 semester menuju sarjana");
//		break;
//		case 6:
//			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname);
//			System.out.println("Semester 6 | 2 semester menuju sarjana");
//		break;
//		case 7:
//			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname);
//			System.out.println("Semester 7 | 1 semester menuju sarjana" );
//		break;
//		case 8:
//			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname + " S.Kom");
//			System.out.println("Semester 8 | SELAMAT S.Kom");
//		break;
//		default:
//		    System.out.println("Cepat LULUS!");
//		}
		
		if(semester >=  144) {
			System.out.println("Nama Lengkap  :" + this.fname + " " + this.lname + " S.Kom");			
			System.out.println("SKS Ditempuh: " + semester );
		} else {
			System.out.println("Nama Lengkap x :" + this.fname + " " + this.lname );	
			System.out.println("SKS Ditempuh: " + semester );
		}
	}
	
	public void getDetailPerson() {
		System.out.println("Nomor Pelajar :" + this.idNumber);
		System.out.println("Tempat Tinggal :" + this.domisili);
	}



}
