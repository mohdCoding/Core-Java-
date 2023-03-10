package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student implements Comparable<Student>
{
	
	private String  name;
	private Integer age;
	private String  tech;
	private Integer exp;
	
	public Student(String name, Integer age, String tech, Integer exp)
	{
		this.name =  name;
		this.age  =  age;
		this.tech =  tech;
		this.exp  =  exp;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getTech() {
		return tech;
	}
	
	public Integer getExp() {
		return exp;
	}

    @Override
	public String toString() {
		return "Student[name="+name+", age="+age+", tech="+tech+", exp=" +exp+ "]";
	}
	
	@Override
	public int compareTo(Student that) {
		return this.exp - that.exp;
	}
	
	
	
}
public class Launch4 {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(new Student("Haroon",19,"Java",5),
	                                       new Student("Akash",29,"Java",2),
	                                       new Student("Cristiano",28,"JS",2),
	                                       new Student("Suarez",29,"Blockchain",3),
	                                       new Student("Nikhil",29,"Scala",4),
	                                       new Student("Alex ferguson",49,"Java",4));
		
		Collections.sort(list);
		Stream<Student> studentStream = list.parallelStream()
		                 .filter(s->s.getTech().equals("Java")?true:false);
		                
		                 
		studentStream.forEach(students -> System.out.println(students));
		
		}

}
