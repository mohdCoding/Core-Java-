package Collection2;
 import java.util.*;
 import java.util.concurrent.CopyOnWriteArrayList;
 
 // we can achieve fail fast or fail safe whatever we want at the time of 
 // Structural modification (it means modifying the data a the time of 
 // Acccesing).
class One
{
	
	public static void ad() {
	    ArrayDeque ad=new ArrayDeque();
	    ad.add(200);
	    ad.add("ineuron");
	    ad.add("Bengaluru");
	    ad.add(11.5);
	    
	     Iterator itr = ad.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	 }
	
}
class Two
{
	
	public static void pq() {
	   PriorityQueue pq=new PriorityQueue();
	   pq.add(12.34);
	   pq.add(30.45);
	   pq.add(40.90);
	   pq.add(45.5);
	   pq.add(23.34);
	   
	
	    
	     Iterator itr = pq.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	 }
	
}

class Three
{
	public static void ts()
	{
		TreeSet ts=new TreeSet();
		ts.add(30);
		ts.add(30);
		ts.add(40);
		ts.add(67);
		ts.add(75);
		ts.add(90);
		
		 Iterator itr = ts.iterator();
		 
		 while(itr.hasNext())
		 {
			int value =  (int) itr.next();
			System.out.println(value);
		 }
		
		
		
	}
}

class Four
{
	
	public static void hs()
	{
		HashSet hs=new HashSet();
		hs.add("23");
		hs.add(89);
		hs.add('s');
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}

class Five
{
	public static void lhs()
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(20);
		lhs.add(34);
		lhs.add(56);
		lhs.add(56);
		lhs.add(78);
		
		 Iterator itr= lhs.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}
}

class Six
{
	public static void ll()
	{
		LinkedList ll=new LinkedList();
		ll.add(34);
		ll.add(78);
		ll.add(65);
		
		Iterator itr=ll.iterator();
		
		while(itr.hasNext())
		{
			LinkedList ll1 = new LinkedList();
			ll1.add(itr.next());
			System.out.println(ll1);
			
		}
	}
	
	public static void al()
	{
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		ListIterator litr  = al.listIterator(2);
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}
}
public class LaunchIterator {

	public static void main(String[] args) {
		
         // One.ad();
		 // Two.pq();
		 // Three.ts();
		 // Four.hs();
		// Five.lhs();
		// Six.ll();
		// Six.al();
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		 
		// fail fast is not happening --> not fail fast
//		for(int i=0; i<al.size(); i++)
//		{
//			System.out.println(al.get(i));
//			al.add(100);
//		}
		
	
		
		
		// fail fast is happening
//		for(Object o:al) {
//			System.out.println(o);
//			al.add(200);
//		}
		
		// fail fast is happening
//		 Iterator itr = al.iterator();
//		 while(itr.hasNext())
//		 {
//			 System.out.println(itr.next());
//			 al.add(1000);
//		 }
		
		CopyOnWriteArrayList cal=new CopyOnWriteArrayList();
		cal.add(20);
		cal.add(90);
		cal.add(543);
		
		// fail fast happening
		// java.util.ConcurrentModificationException
//		for(Object a:al)
//		{
//			System.out.println(a);
//			al.add(90);
//		}
		
		
		//failSafe is happening because of the use of CopyOnWriteArrayList
		// The exception will not occur here and stoping from 
		// Structural modification
		Iterator citr = cal.iterator();
		while(citr.hasNext()) {
			System.out.println(citr.next());
			cal.add(1000);
		}
		
		
		
		 
		 
		
		
		
		
		
		
	}

}
