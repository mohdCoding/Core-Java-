package StreamApi;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

class ConsumerAction<T> implements Consumer<Integer>
{
	public void accept(Integer i) {
		System.out.println(i);
	}
}

class ConsumerAction1 implements Consumer<String>{
	
	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}


public class Launch1 {

	public static void main(String[] args) {
		
		List<Integer> al= Arrays.asList(1,2,3,4,5);
		
		
	   Stream<Integer> stream1=al.stream();
	   
	   Consumer consumer = new ConsumerAction();
	   
	   
	   stream1.forEach(consumer);
	   
	   
	  List<String> names= Arrays.asList("haroon","Sriharan","vasanth","mugesh","manoj");
       
	  Stream<String> nameStream1 = names.stream();
	  
	  Consumer consumer1=new ConsumerAction1();
	  nameStream1.forEach(consumer1);
	  
	  /*
	   nameStream1.forEach(consumer1);
	   Note:-----------------------------------------
	   once a stream is used it cannot be used again
	   we can use a stream only once then its gone
	  */
	  
	  
	  
	  
	  
	}

}
