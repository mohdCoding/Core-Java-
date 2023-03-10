package Encapsulation;

class Telusko{
	
	private String name;
	private int age;
	
	public Telusko(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Telusko(String name) {
		this(15);
		this.name = name;
	}
	
	
	
	public Telusko(int age) {
		this("haroon",age);
		
	}
	
	public Telusko() {
		this("hyder", 28);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Telusko t1 = new Telusko("naveen", 40);
            System.out.println(t1.getName());
            System.out.println(t1.getAge());
            
            Telusko t2 = new Telusko();
            System.out.println(t2.getName());
            System.out.println(t2.getAge());
            
            Telusko t3 = new Telusko("Firoz");
            System.out.println(t3.getName());
            System.out.println(t3.getAge());
            
            Telusko t4 = new Telusko(19);
            System.out.println(t4.getName());
            System.out.println(t4.getAge());
            
            
            
	}

}
