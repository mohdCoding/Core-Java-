package MultiThreading1;


class Alpha extends Thread
{
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		if(name.equals("BANK")) {
			banking();
		}else if(name.equals("PRINT")) {
			printing();
		}else {
			calculating();
		}
		
	}
	
	public void banking() {
		System.out.println("Start Banking");
		
		for(int i=1; i<=3; i++)  {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				// TODO Auto-generated catch block
			
			
			System.out.println("Banking.......");
		}
		
	}
	
	public void printing() {
		System.out.println("Start Printing");
		
		for(int i=1; i<=3; i++)  {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				// TODO Auto-generated catch block
			
			
			System.out.println("Printing.......");
		}
		
	}
	
	public void calculating() {
		System.out.println("Start calculating");
		
		for(int i=1; i<=3; i++)  {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				// TODO Auto-generated catch block
			
			
			System.out.println("calculating.......");
		}
		
	}
	
}
public class LaunchRun2 {

	public static void main(String[] args) {
	    Alpha a1 = new Alpha();
	    Alpha a2 = new Alpha();
	    Alpha a3 = new Alpha();
	    
	    
	    a1.setName("BANK");
	    a2.setName("PRINT");
	    a3.setName("CALC");
	    
	    a1.start();
	    a2.start();
	    a3.start();
	    

	}

}
