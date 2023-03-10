package Has_A_Relationship;

public class TestEmployee {

	public static void main(String[] args) {
		
//	  Account account =  new Account("123", "ISB-2212", "Marcelo");
//
//	  // create target object and inject the dependent object in the constructor
//	  Employee employee = new Employee(45, "Marcelo", "Brazil", account);
//	  
		Account account  = new Account();
		
		account.setAccName("marcelo");
		account.setAccNo("234");
		account.setAccType("ISB-1010");
		
		Employee employee = new Employee();
		
		employee.seteId(345);
		employee.seteName("marcelo");
		employee.seteAddress("Brazil");
		employee.setAccount(account);
		
	    employee.display();
	}

}
