package ExceptionHandling3;

import java.io.*;
class Before implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("the resource is closed");
		System.out.println("developers do not worry");
	}
	
	AutoCloseable ac = new AutoCloseable() {
		
		@Override
		public void close() {
			System.out.println("the resource is closed");
		    System.out.println("developers do not worry");
		}
	};
	
	
	
}
class A {
	
	public void show() throws Exception {
		// try with resource
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String name = br.readLine();
			int age = Integer.parseInt(br.readLine());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}finally {
			
			 br.close();
			
		}
		
	}
	public void disp() {
		// try with resource
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String name = br.readLine();
			int age = Integer.parseInt(br.readLine());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void display() {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); 
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("enter the name");
			String name = br.readLine();
			System.out.println("ENter the age");
			int age = Integer.parseInt(br1.readLine());
			System.out.println("Enter the height");
			double height = Double.parseDouble(br2.readLine());
		}catch(Exception e) {
			
		}
	}
	
	public void check() {
		
		//try(String str = new String("sachin")){
			// if you want to use try with resource  that resources must need 
			// to implement the interface called AutoCloseable-- otherwise not allowed
			// here string class does not implemented the interface AutoCloseable--so
			// compile time error
		// }catch(Exception e) {
			
		// }
		
		try(AutoCloseable ac = new AutoCloseable() {
			
			@Override
			public void close() {
				System.out.println("the resource is closed");
			    System.out.println("developers do not worry");
			}
		};){
			System.out.println("inside try in check method A class");
		}catch(Exception e) {
			
		}
		
       
	}
	
	public void check2() {
		
		 try(AutoCloseable b = new Before()){
	        	// for our custom class also it will be defaultly reference will be final
	        	// even if you want you can also declare as final but it is not mandotary 
	        	// it is optional
	        	// b = new Before();
				System.out.println("inside try in check method A class");
			}catch(Exception e) {
				
			}
	}
	
}






public class ExceptionTR1 {

	public static void main(String[] args) throws Exception {
		A a = new A();
		// a.disp();
		//a.show();
		// a.display();
		// a.check();
		a.check2();
		System.out.println("Succesfully executed");

	}

}
