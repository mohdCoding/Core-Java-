package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Launch3 {

	public static void main(String[] args) {

	   List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
	   Stream<Integer> s1= list.parallelStream();
	   Stream<Integer> s2= s1.filter(number -> number%2==1);
	   Stream<Integer> s3 = s2.map(odd -> odd*2);
	   int result= s3.reduce(0, (previous,next) -> previous + next);
	   System.out.println(result);
	   
	   List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
	   int result1 = list2.parallelStream()
			               .filter(number -> number%2==1)
	                       .map(odd -> odd*2)
	                       .reduce(0, (previous,next) -> previous + next);
	   System.out.println(result1);
	   
	   
	   
	  

	}

}
