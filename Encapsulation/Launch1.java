package Encapsulation;

class Person{
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class Launch1 {


	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setName("harry");
		p1.setAge(18);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		

	}
	
	


}
