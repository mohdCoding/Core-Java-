package Collections;

/**
 * ArrayList follows Dynamic Array DataStructures
 * Duplicates are allowed
 * index based working
 * everything is an treated as object in ArrayList
 * ArrayList is mutable
 */

import java.util.*;
public class ArrayListLaunch {

	public static void main(String[] args) {
	    
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20.23);
		al1.add("name");
		al1.add(true);
		al1.add('S');
		al1.add(10);
		al1.add(null); 
		
		System.out.println(al1);
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		System.out.println(al2);
		
		al2.add(1, 15);
		System.out.println(al2);
		
		al1.addAll(al2);
		System.out.println(al1);
		
		al2.addAll(2, al1);
		System.out.println(al2);
		
		al2.clear();
		System.out.println(al2);
		
		for(int i=0; i<al1.size(); i++)
		{
			System.out.println(al1.get(i));
		}
		System.out.println();
		
		System.out.println(al2.size());
		
		/**
		 for(int i=0; i<=al2.size(); i++)  
		 {
		  System.out.println("printing : " + al2.get(i)); --> IndexOutOfBoundsException
		 }
		**/
		System.out.println("______________________________________");
		System.out.println("______________________________________");
		
		ArrayList al3=new ArrayList();
		System.out.println(al3.size());
		al3.ensureCapacity(3);
		al3.add("ensure");
		al3.add("capacity");
		al3.add("method");
		
		System.out.println(al3.size());
		System.out.println(al3);
		al3.add("we can able to store more also than we specified");
		System.out.println(al3);
		
		
		ArrayList al4=new ArrayList();
		al4.ensureCapacity(10);
		System.out.println(al4.size());
		System.out.println(al4.getClass());
		System.out.println("size before: " + al4.size());
		al4.add(200);
		al4.add(400);
		al4.add(600);
		al4.add(al4);
		System.out.println("size after: " + al4.size());
	    al4.trimToSize();
	    System.out.println(al4.size());
	    
	   boolean b = al4.contains(al4);
	   
	   System.out.println(b);
	   
	   System.out.println(al4.isEmpty());
	   al4.clear();
	   System.out.println(al4.isEmpty());
	   
	   
	   ArrayList al5=new ArrayList();
	   al5.ensureCapacity(200);
	   System.out.println();
	   System.out.println(al5.isEmpty());
	   System.out.println(al5.size());
	   al5.add(1);
	   al5.add(10);
	   al5.add(21);
	   al5.add(1);
	   al5.add(1);
	   System.out.println(al5);
	   ArrayList al6 =(ArrayList) al5.clone();
	   System.out.println("it is cloned: " + al6);
	   boolean c = al5.containsAll(al6);
	   System.out.println(c);
	   System.out.println(al5.indexOf(21));
	   System.out.println(al2.indexOf(0));
	   System.out.println(al5.lastIndexOf(1));
	   al5.remove(2);
	   System.out.println(al5.get(2));
	   
	   ArrayList al7 = new ArrayList();
	   al7.add("string");
	   al7.add("Sting");
	   al7.add("String");
	   al7.add("StRiNG");
	   System.out.println(al7);
	   al7.remove("String");
	   System.out.println(al7);
	   al7.addAll(al1);
	   System.out.println(al7);
	    al7.removeAll(al1);
	    System.out.println("removed:  " +al7);
	    
	    al7.add(al1);
	    System.out.println("added: " + al7);
	    al7.removeAll(al1);
	    System.out.println("r1 : " + al7);
	    
	   
	   
	   
	   
	   
		
		
		

	}

}
