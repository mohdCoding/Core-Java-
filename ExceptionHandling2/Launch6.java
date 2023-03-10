package ExceptionHandling2;


public class Launch6 extends RuntimeException{ // or extends Exception or Throwable is fine

	Launch6(String name,int age){
		System.out.println("constructor launch6");
		System.out.println(name);
		System.out.println(age);
	}
	
	
   Launch6() throws ArithmeticException{
	   int c = 10 / 0;
	   System.out.println("the c value is : " + c);
   }
	public static void main(String[] args) {
	
		// throw new Launch6("name", 10);
		
		try {
	      new Launch6();
		}
         catch(ArithmeticException e) {
			System.out.println("/ by zero");
		}catch(Exception e) {
			System.out.println("common exception");
		}
		
		try {
		throw new Launch6("name", 10);
		}catch(Launch6 l) {
			System.out.println("launch method exception");
		}catch(Exception e) {
			System.out.println("handled by Generic Exception");
		}
		
		System.out.println("reachable code");
		// System.out.println("eek ");  --> unreachable code
		
		
		
		
	}

}
