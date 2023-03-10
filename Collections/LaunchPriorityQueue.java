package Collections;

import java.util.PriorityQueue;

/**
 * It follows Minimum-Heap DataStructure
 * Homogeneous only allowed
 * duplicates allowed
 * order of insertion not maintained
 * adding can be possible in rare end only
 * accessing element index based not allowed
 * removing possible but not based on index based on object
 * Contiguous memory Location
 */
class Demo
{

	public static void example1()
	{
		
		PriorityQueue pq=new PriorityQueue();
		pq.add("some");
		pq.add("name");
		pq.add("are");
		pq.add("string i");
		pq.add("need to");
		pq.add("store here");
		
		// pq.add(3); --> only homogeneous data allowed
		System.out.println(pq);
		
	  pq.remove("need to");
	  System.out.println(pq);
	  pq.remove();
	  System.out.println(pq);
	  
	  
	}
	
	public static void example2()
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(50);
		pq.add(75);
		pq.add(25);
		pq.add(100);
		pq.add(175);
		pq.add(150);
		pq.add(125);
		System.out.println(pq);
	}
}
public class LaunchPriorityQueue {

	public static void main(String[] args) {
		
		Demo.example2();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
