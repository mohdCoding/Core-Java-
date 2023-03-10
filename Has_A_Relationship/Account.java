package Has_A_Relationship;

// DEPENDANT CLASS
public class Account {

	
	private String accNo;
	private String accType;

	private String accName;
	
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}
	// CONSTRUCTOR INJECTION
//	public Account(String accNo, String accType, String accName) {
//		System.out.println("Account constructor");
//		this.accNo = accNo;
//		this.accType = accType;
//		this.accName = accName;
//	}
//	
	public String getAccNo() {
		return accNo;
	}
	public String getAccType() {
		return accType;
	}
	public String getAccName() {
		return accName;
	}
	
}
