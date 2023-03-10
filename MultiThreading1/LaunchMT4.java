package MultiThreading1;

import java.util.Scanner;

class Addition extends Thread
{
	@Override
	public void run() {
		System.out.println("Addition is started");
		System.out.println("Adding....");
		System.out.println("Adding....");
		System.out.println(add(100,100));
		System.out.println("Addition Thread : " + Thread.currentThread().getName());
		System.out.println("Addition completed");
	}
	public int add(int a, int b) {
		return a+b;
	}
	

}

class Subtraction extends Thread
{
	
	@Override
	public void run() {
		System.out.println("Subtraction is started");
		System.out.println("subtracting...");
		System.out.println("subtracting....");
		System.out.println(sub(2000,100));
		System.out.println("Subtraction Thread : " + Thread.currentThread().getName());
		System.out.println("Subtraction completed");
		
	}
	public int sub(int a, int b) {
		return a-b;
	}
}

class Multiplication extends Thread
{
	
	@Override
	public void run() {
		System.out.println("Multiplication is started");
		System.out.println("multiplicating...");
		System.out.println("multiplicating....");
		System.out.println(mul(21,21));
		System.out.println("multiplication Thread : " + Thread.currentThread().getName());
		System.out.println("Multiplication completed");
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
}
public class LaunchMT4 {

	public static void main(String[] args) throws Exception {
		
		Thread.currentThread().isAlive();
		System.out.println("Main Thread started the execution");
	   
	    Multiplication m=new Multiplication();
	    Subtraction s=new Subtraction();
	    Addition a=new Addition();
	
	  //  a.setName("Addition");
	   // s.setName("Subtraction");
	    
	    
	     a.start();
	     s.start();
	     m.start();
	     
	     System.out.println("which Thread : " + Thread.currentThread().getName());
	      
	     System.out.println(a.isAlive());
		 System.out.println(s.isAlive());
	     System.out.println(m.isAlive());
		   
	     System.out.println("which Thread : " + Thread.currentThread().getName());
	     a.join();
	     s.join();
	     m.join();
	     
	     //Thread.sleep(1);
	     System.out.println(a.isAlive());
		 System.out.println(s.isAlive());
		 
		 System.out.println("which Thread : " + Thread.currentThread().getName());
		 
	     System.out.println(m.isAlive());
		   
	     System.out.println("Main thread has completed its work");
  
	}

}
