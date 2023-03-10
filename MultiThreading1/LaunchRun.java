package MultiThreading1;

class Demo1 implements Runnable
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
}

class Demo2 implements Runnable
{
	@Override
	public void run() {
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
}

class Demo3 implements Runnable
{
	@Override
	public void run() {
		System.out.println("Start Calculating");
		
		for(int i=1; i<=3; i++)  {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				// TODO Auto-generated catch block
			
			
			System.out.println("Calculating.......");
		}
		
	}
}
public class LaunchRun {

	public static void main(String[] args) {
	   Demo1 d1 = new Demo1();
	   Demo2 d2 = new Demo2();
	   Demo3 d3 = new Demo3();
	   
	   Thread t1 = new Thread(d1);
	   Thread t2 = new Thread(d2);
	   Thread t3 = new Thread(d3);
	   
	   t1.start();
	   t2.start();
	   t3.start();

	}

}
