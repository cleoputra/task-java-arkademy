package parentInterface;

public class Cat extends Animal{
	public Cat(String namaKucing, int a, String b, String c) {
		super(a, b, c);
		this.namaKucing = namaKucing;
	}
	
	private String namaKucing;
	
	
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return namaKucing + " " +super.getDetail();
	}
	public void getNamaKucing() {
		System.out.println(namaKucing);
	}
	
}
