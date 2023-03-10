package MultiThreading1;

class t extends Thread
{
	
	public void run() {
		System.out.println("t is running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("execution finished");
	}
}
public class LaunchMT6 {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Main thread is started");
		
		t tt = new t();
		tt.start();
		
		tt.join();
		
		System.out.println("main thread finished execution");

	}

}
