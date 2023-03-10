package MultiThreading1;

import java.util.Scanner;

class Add extends Thread
{
	@Override
	public void run() {
		System.out.println(add());
	}
	
	
	public int add() {
		Scanner in = new Scanner(System.in);
       System.out.println("add Enter number 1");
       int a = in.nextInt();
       System.out.println("add Enter number 2");
       int b = in.nextInt();
	   return a+b;
	}
}

class Sub extends Thread
{
 
	
  @Override
  public void run() {
	  System.out.println(sub());
  }
	public int sub() {
		Scanner in = new Scanner(System.in);
       System.out.println("sub Enter number 1");
       int a = in.nextInt();
       System.out.println("sub Enter number 2");
       int b = in.nextInt();
	   return a+b;
	}
}

class Mul extends Thread
{
   
	
    @Override 
    public void run() {
    	System.out.println(mul());
    }
    
	public int mul() {
		 Scanner in = new Scanner(System.in);
       System.out.println("mul Enter number 1");
       int a = in.nextInt();
       System.out.println("mul Enter number 2");
       int b = in.nextInt();
	   return a*b;
	}
}
public class LaunchMT5 {

	public static void main(String[] args) {
		System.out.println("Main thread started");
		Add a = new Add();
		Sub b = new Sub();
		Mul m = new Mul();
		
		a.start();
		b.start();
		m.start();
		
		System.out.println("main thread has finished");

	}

}
