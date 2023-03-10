package MultiThreading1;

public class LaunchMT2 {

	public static void main(String[] args) throws Exception {
		// three units , subprocess executing by one thread 
		// they are independent to each other 
		// we need to execute all the task simultaneously not one by one
		// here the problem is single threading --> multithreading applied in LaunchMT3
		System.out.println("Start Banking");
		
		for(int i=1; i<=3; i++)  {
			Thread.sleep(2000);
			System.out.println("Banking.......");
			
		}
		
		System.out.println("____________________________________");
		

		System.out.println("Start Calculating");
		
		for(int i=1; i<=3; i++)  {
			Thread.sleep(2000);
			System.out.println("Calculating.......");
		}
		
		System.out.println("____________________________________");
		
		

		System.out.println("Start Printing");
		
		for(int i=1; i<=3; i++)  {
			Thread.sleep(2000);
			System.out.println("Printing.......");
		}
		
		System.out.println("____________________________________");

	}

}
