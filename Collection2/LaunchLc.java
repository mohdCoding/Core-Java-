package Collection2;

import java.util.*;


public class LaunchLc {

	public static void main(String[] args)
	{
		// THis is are the legacy classes which is out of date in java
		// instead we are using collections
		// Dictionary(<>) instatiate by using Hashtable(key value pair)
		// Properties (key value pair) --> it is a class
		// Stack
		// Vector
		
	
		Properties v = new Properties();
		v.put(":", "Key");
	
		
		 Enumeration e= v.elements();
		 
		 while(e.hasMoreElements())
		 {
			 System.out.println(e.nextElement());
			 
		 }
	}
}
