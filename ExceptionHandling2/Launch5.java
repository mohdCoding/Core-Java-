package ExceptionHandling2;

import java.util.InputMismatchException;

class Alien 
{
	 String name;
	 int age;
	Alien(String name, int age) throws InputMismatchException
	{
		this.name = name;
		this.age = age;
		throw new InputMismatchException("invalid input");
	}
	
	
	

}
public class Launch5 {

	public static void main(String[] args) {
		
		try {
		  Alien  a = new Alien("name",10);
		  System.out.println(a.name + "  :  " + a.age);
		}catch(InputMismatchException e) {
			System.out.println("Invalid input main method handled");
		}
		
		System.out.println("Program executed");

	}

}
