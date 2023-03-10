package Has_A_Relationship;

// DEPENDANCY INJECTION
// 2 WAYS WE CAN DO
// 1. CONSTRUCTOR INJECTION 2. SETTER INJECTION 


// TARGET CLASS
public class Employee {


	private Integer eId;
	private String eName;
	private String eAddress;
	// has-a-variable injection
	private Account account;
	// CONSTRUCTOR INJECTION
//	public Employee(Integer eId, String eName, String eAddress, Account account) {
//		System.out.println("Employee constructor");
//		this.eId = eId;
//		this.eName = eName;
//		this.eAddress = eAddress;
//		this.account = account;
//	
	
	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void display() {
	     System.out.println("**********Employee details here**********");
	     System.out.println("Id :: " + eId);
	     System.out.println("Name :: " + eName);
	     System.out.println("Address ::" + eAddress);
	     System.out.println("**********Account details here**********");
	     System.out.println("account no :: " + account.getAccNo() );
	     System.out.println("account type :: " + account.getAccType());
	     System.out.println("account name :: " + account.getAccName());
	  }
	

}
