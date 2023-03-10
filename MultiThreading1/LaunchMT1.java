package MultiThreading1;


public class LaunchMT1 {

	public static void main(String[] args) {
		System.out.println("Hey focus here");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread is awake after 5 second and executed the task");
		
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		String tName = t.getName();
		int tPriority = t.getPriority();
		
		System.out.println(tName);
		System.out.println(tPriority);
		
		t.setName("MyThread");
		t.setPriority(4);
		
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		System.out.println(Thread.currentThread());
	}

}
