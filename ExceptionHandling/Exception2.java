package ExceptionHandling;

class demo {
	
	public void disp() {
		try {
       disp();
		}catch(StackOverflowError e) {
			System.out.println("catched in starting point only");
		}
	}
	
}

class demo2 {
	
	
		demo d = new demo();
		
		public void disp() {
			try {
			d.disp();
			}catch(StackOverflowError e) {
				System.out.println("handled exception");
			}
		}
	
}

public class Exception2 {

	public static void main(String[] args) {
		
		demo2 s = new demo2();
		
		try {
		s.disp();
		}catch(StackOverflowError e) {
			System.out.println("something happend");
		}
		
	}

}
