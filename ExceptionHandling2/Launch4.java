package ExceptionHandling2;

class abc {
	
	
	public int disp() throws ArithmeticException {
		
		try {
		   System.out.println("disp method");
		   throw new ArithmeticException("/by zero");
		}
		finally {
			System.out.println("finally block dominating the return statement");
		}
		
	}
	
	public void show() {
		
		try {
			System.out.println("show method");
		     System.exit(0);
		     System.out.println("It never execute this statement");
		}finally {
			System.out.println("It will never execute");
		}
	}
	
	public int call() {
		try {
			System.out.println("show method");
			  
			 try {
				
				 return 4;
		         
			 }finally {
				 System.out.println("finally call dominated the return statement");
			 }
			 
		}finally {
			System.out.println("It will never execute");
		}
	}
}
public class Launch4 {

	public static void main(String[] args) {
		   abc a = new abc();
		   try {
		   System.out.println(a.disp());
		   }catch(Exception e) {
			  System.out.println(e.getMessage());
		   }
		  

	       System.out.println(a.call());
	       
	       a.show();
	}

}
