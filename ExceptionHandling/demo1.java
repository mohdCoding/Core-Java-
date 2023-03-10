package ExceptionHandling;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

class a{
	
	
	public void divide() {
		
		
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
		   int c = a / b;
		   System.out.println(c);
		}catch(NullPointerException e) {
			System.out.println("values cannot be null");
		}catch(ArithmeticException e) {
			System.out.println("num2 cannot be zero");
		}catch(Exception e) {
			System.out.println("Give an proper input!");
		}

	}
	
public void divide2() {
		
		
	
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
		   int c = a / b;
		   System.out.println(c);
		
		

	}
	
	
	
}
public class demo1 {

	public static void main(String[] args) throws IOException {
//		a a = new a();
//		
//		a.divide();
//		
//		try {
//		a.divide2();
//		}catch(ArithmeticException e) {
//		   e.printStackTrace();
//		}catch(InputMismatchException e) {
//			e.printStackTrace();
//		}
//		
//		a.divide();

		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println("something happended");
			
		}
	}

}
