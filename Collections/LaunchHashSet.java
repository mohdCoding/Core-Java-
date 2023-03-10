package Collections;

import java.util.*;
/**
 * added in version 1.2
 * Order of insertion not maintained
 * not in sorted order
 * internally following Hashtable or hashfunction
 * implementing Set Interface
 * Searching will be done fast
 */
public class LaunchHashSet {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(45);
		hs.add(34);
		hs.add(122);
		hs.add(178);
		hs.add(187);
		
	    
		System.out.println(hs);
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
		

		
	}

}
