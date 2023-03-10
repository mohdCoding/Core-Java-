package ExceptionHandling3;

import java.util.Scanner;


class InvalidUserException extends RuntimeException {
	
	InvalidUserException(String msg){
		super(msg);
	}
	
}





class ATM {
	
	private int accountNumber = 1111;
	private int password = 2222;
	private int accNo;
	private int pwd;
	
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your account number");
	    accNo = in.nextInt();
	    System.out.println("Enter your password");
	    pwd = in.nextInt();
	}
	
	public void verify() throws InvalidUserException {
		
		if(accountNumber == accNo && password == pwd) {
			System.out.println("Collect your cash");
		}else {
			
			/*
			 * InvalidUserException iue = new InvalidUserException();
			 * System.out.println("Invalid account number or password");
			 * throw iue;
			*/
			throw new InvalidUserException("Invalid Credentials");
			
		}
	}
}

class Bank {
	
	public void initiate() {
		 ATM atm = new ATM();
		 
		 try {
		      atm.input();
		      atm.verify();
		 }catch(InvalidUserException e) {
			 try {
				 System.out.println(e.getMessage());
			     atm.input();
			     atm.verify();
			 }catch(InvalidUserException f) {
				 try {
					 System.out.println(e.getMessage());
				     atm.input();
				     atm.verify();
				 }catch(InvalidUserException g) {
					System.out.println("Card is blocked TATA BYE BYE");
					System.exit(0);				 
				}
			 }
		 }
	}
}
public class Exception1 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.initiate();

	}

}
