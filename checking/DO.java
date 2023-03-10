package checking;

import java.util.InputMismatchException;


public class DO {

	public static void main(String[] args) {
		String str = "Hello Java Ava learners";
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("ava", 3));
		System.out.println(str.indexOf(65));
		System.out.println(str.indexOf('a' , 5));
		int c = "A Bname".indexOf(65);
		System.out.println(c + " the c is");

	}

}
