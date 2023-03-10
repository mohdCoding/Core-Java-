
class Alien
{
	private int age;
	private String name;
	
	private static int count;

	static{
		count++;
	}
	
	Alien()
	{
		// count++;
	}
	
	Alien(int age)
	{
		this.age=age;
		// count++;
	}
	Alien(int age, String name)
	{
		this.age=age;
		this.name=name;
		// count++;
	}

	public int getCount(){
         return count;
	}
}


public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien a1=new Alien();
		Alien a2=new Alien(28);
		Alien a3=new Alien(28, "Rahul");
		
		System.out.println(a1.getCount());
		System.out.println(Alien.getCount())

	}

}
