package ExceptionHandling;

class Arith{
	
	public void div(int a, int b) {
		 
		try {
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("num2 cannot be zero");
		}catch(Exception e) {
			System.out.println("invalid input!");
		}
		
	}
		
}
public class ExceptionHandling {

	public static void main(String[] args) {
		Arith a = new Arith();
		
		
		a.div(12, 0);
		
		add(5,5);
		
		

		
		System.out.println("Execution completed");
		
		
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}

}
