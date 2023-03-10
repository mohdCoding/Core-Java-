package Collections;

import java.util.TreeSet;

class DemoTreeset
{
	
	public void example1()
	{
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(78);
		ts.add(55);
		ts.add(123);
		ts.add(300);
		ts.add(2);
		System.out.println(ts);
		
		System.out.println(ts.higher(300));
		System.out.println(ts.higher(55));
		System.out.println(ts.ceiling(0));
		System.out.println(ts.ceiling(2));
		
		System.out.println(ts.lower(123));
		System.out.println(ts.lower(2));
		System.out.println(ts.floor(2));
		System.out.println(ts.floor(101));
		
	
		
		
	
	}
}
public class LaunchTreeSet {

	public static void main(String[] args) {
		
		DemoTreeset dt=new DemoTreeset();
		dt.example1();

	}

}
