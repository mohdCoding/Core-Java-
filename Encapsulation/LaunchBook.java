package Encapsulation;

class JavaBook{
	
	private int pgNo;

	public int getPgNo() {
		return pgNo;
	}

	public void setPgNo(int pgNo) {
		if(pgNo > 0) {
		 this.pgNo = pgNo;
		}else {
			System.out.println("Invalid Input");
		}
	}
	
	
}
public class LaunchBook {

	public static void main(String[] args) {
		
		JavaBook b=new JavaBook();
		b.setPgNo(90);
		System.out.println(b.getPgNo());

	}

}
