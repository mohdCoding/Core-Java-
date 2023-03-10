package MultiThreading1;

class Banking extends Thread
{
	@Override
	public void run() {
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
	
	public void display() {
		System.out.println("display method in Banking Thread");
	}
	
	
}

class Printing extends Thread
{
	public void display() {
		System.out.println("display method in Printing Thread");
	}
	
	@Override
	public void run()  {

		System.out.println("Start Printing");
		
		for(int i=1; i<=3; i++)  {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing.......");
		}
		
		System.out.println("____________________________________");
	}
	
}

class Calculating extends Thread
{
	@Override
	public void run(){
        System.out.println("Start Calculating");
		
		for(int i=1; i<=3; i++)  {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Calculating.......");
		}
		
		System.out.println("____________________________________");
	}
	
	public void display() {
		System.out.println("display method in Calculating Thread");
	}
}
public class LaunchMT3 {

	public static void main(String[] args) throws Exception {
		Banking banking = new Banking();
		Printing printing = new Printing();
		Calculating calculating = new Calculating();
		/*handling threads to  thread scheduler using start methods it will intenally
		 * calls the run method but which run method it will call is not in our hand
		 * it will decided by thread scheduler*/
	    banking.start();
	    printing.start();
	    calculating.start();
	    
	    /*
	     banking.display();
	     printing.display();
	     calculating.display();
	    */
		
		/** 
		 * it is equivalent to the work of single threading
		 * main thread calls banking run() method first it exectues
		 * then printing run() methods executes 
		 * then calculating run() method executes
		 * we are not hanlig the threads to thread scheduler
		 * 
	    banking.run();
	    printing.run();
	    calculating.run();
	    **/
	    
	    Thread.sleep(10000);
	    
	    System.out.println(banking.currentThread());
	    System.out.println(printing.currentThread());
	    System.out.println(calculating.currentThread());
		

	}

}
