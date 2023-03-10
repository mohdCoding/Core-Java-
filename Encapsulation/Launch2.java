package Encapsulation;


class Book{
	 
	private String bName;
	private int pgNo;
	
	public Book(String bName, int pgNo) {
		this.bName = bName;
		this.pgNo =  pgNo;
	}

	public String getbName() {
		return bName;
	}

	public int getPgNo() {
		return pgNo;
	}
	
	
	
}
public class Launch2 {

	public static void main(String[] args) {
		Book b1 = new Book("Java", 712);
		
		System.out.println(b1.getbName());
		System.out.println(b1.getPgNo());
		
		

	}

}
