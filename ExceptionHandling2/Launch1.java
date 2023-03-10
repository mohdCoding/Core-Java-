package ExceptionHandling2;

import java.util.Scanner;

class Ronaldo {
	
	
	public void add() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to calculator");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a + b;
		Thread.sleep(5000);
		System.out.println("the addition is " + c);
		Thread.sleep(10000);
		System.out.println("This program executed sucessfully");
	}
	public void division()  {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to calculator");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a/b; // unchecked exception
		System.out.println("The division value is " + c);
	}
	
	
}

class Messi {
	
	Ronaldo r = new Ronaldo();
	public void division() {
		
		try {
		
		    r.division();
		}catch(Exception e) {
			System.out.println("num2 cannot be zero");
		}
	}
	
	public void add() throws Exception {
		r.add();
	}

	

	
}

public class Launch1 {

	public static void main(String[] args) throws Exception {
            Messi m = new Messi();
            m.division();
            m.add();
	}

}
