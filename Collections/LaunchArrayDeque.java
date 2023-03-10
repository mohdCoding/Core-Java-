package Collections;


import java.util.ArrayDeque;


/*
 * It can Store both homo and hetro
 * It can allow duplicates
 * order of insertion in maintained
 * adding in front and end is allowed
 * 
 * we cannot remove or add elements based on index
 * (index based operations are not permitted)
 */
class Alien
{
	
	public static void example1() {
		ArrayDeque ad = new ArrayDeque();
		System.out.println(ad.size());
		ad.add("Bluetooth");
		ad.add(1500);
		ad.addFirst("Headphones");
		ad.addLast(3.14);
		
		System.out.println(ad);
		System.out.println(ad.element());
		System.out.println(ad.size());
		
		ad.remove();
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
	}
	
	public static void example2() {
		ArrayDeque ad=new ArrayDeque();
		
		System.out.println(ad);
		System.out.println(ad.size());
		ad.add("My");
		ad.add("name");
		ad.add("Is");
		ad.add("Mohammed");
		ad.add("Haroon");
		
		String name =(String) ad.getLast();
		System.out.println(name);
		
		String first = (String) ad.getFirst();
		System.out.println(first);
		
		String get = (String) ad.element();
		System.out.println(get);
		
		System.out.println(ad.remove());
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);
		
		ad.remove("Mohammed");
		System.out.println(ad);
	}
}

public class LaunchArrayDeque {

	public static void main(String[] args) {
		// Alien.example1();
		Alien.example2();

	}

}
