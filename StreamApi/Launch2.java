package StreamApi;


import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.TreeSet;
import java.util.SortedSet;

class MyPredicate implements Predicate<Integer>{
	
	
	@Override
	public boolean test(Integer number) {
		
		if(number%2 == 1) 
			return true;
		
		return false;
	}
}


public class Launch2 {

	public static void main(String[] args) {
		
		
		SortedSet   num = new TreeSet();
		num.add(1); num.add(2); num.add(3);
		num.add(4); num.add(5); 
		
		Predicate<Integer> predicate=new MyPredicate();
		 
		Function<Integer,Integer> func=new Function<Integer,Integer>() {
			
			@Override
			public Integer apply(Integer num) {
				return num*=2;
			}
			
		};
		
		BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				  return t+u;
			}
			
		};
		
	   Stream<Integer> stream1 = num.stream();
	   Stream<Integer> stream2 = stream1.filter(predicate);
	   Stream<Integer> stream3 = stream2.map(func);
	   int result = stream3.reduce(0, binaryOperator);
	   System.out.println(result);
	  
	  
		  
	   
	  
	 

	}

}
