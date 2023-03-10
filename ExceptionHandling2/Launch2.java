package ExceptionHandling2;

import java.util.Scanner;

class Alpha{
	
	public void division() throws ArithmeticException {
		
		try {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to calculator");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a/b; // unchecked exception
		System.out.println("The division value is " + c);
		}catch(ArithmeticException e) {
			System.out.println("Exception handled in division method only");
			 throw e;
		}
		
		   System.out.println("Thanks for calculating");
		
	}
}
public class Launch2 {

	public static void main(String[] args) {
		Alpha a = new Alpha();
		
		try {
		  a.division();
		}catch(ArithmeticException e) {
			System.out.println("Exception handled in main method ");
		}

	}

}
