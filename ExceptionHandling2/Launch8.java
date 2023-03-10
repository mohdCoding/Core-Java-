package ExceptionHandling2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class Demo {
	
	void disp() throws ArithmeticException{
		System.out.println("Parent class overriden method");
	}
	
	void show() throws InputMismatchException {
		System.out.println("show Parent class overriden method");
	}
	
	void add() {
		
		try {
		Scanner in  = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a/b;
		System.out.println("the value of c is : " + c);
		}catch(ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			
		}
		System.out.println("program executed successfully");
	}
	
     void div() {
		
		try {
		Scanner in  = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a/b;
		System.out.println("the value of c is : " + c);
		}catch(ArithmeticException e ) {
			
		}
		System.out.println("program executed successfully");
	}
}

class Demo1 extends Demo {
	
	void disp() throws ArrayIndexOutOfBoundsException {
		System.out.println("Child class overriding method");
	}
	
	void show() {
		System.out.println("show child class overriding method");
	}
}
public class Launch8 {

	public static void main(String[] args) {
		
		Demo d = new Demo1();
		d.disp();
		d.show();

		
		d.add();
	}

}
