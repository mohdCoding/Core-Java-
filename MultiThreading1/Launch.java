package MultiThreading1;

public class Launch implements Runnable {

	public static void main(String[] args) throws Exception {
		System.out.println("main started");
		  Thread t = new Thread(new Launch());
		  t.start();
		  
		
		  System.out.println("main finished");

	}
	
	public void run() {
		System.out.println("started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finished");
	}

}
