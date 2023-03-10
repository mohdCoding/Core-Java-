
public class Launch2 {
	
	static int a,b,c;
	
	static 
	{
		System.out.println("Static block");
		a=10;
		b=20;
		c=30;
		
	}
	
	static void disp1()
	{
		System.out.println("Static method disp1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	int m,n,o;
	
	{
		System.out.println("non static block");
		m=100;
		n=200;
		o=300;
		a=40;
		b=50;
		c=70;
	}
	
	Launch2()
	{
		
		System.out.println("Constructor");
	}
	
	void disp2()
	{
		System.out.println("non static method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		disp1();
		Launch2 l=new Launch2();
		l.disp2();

	}

}
