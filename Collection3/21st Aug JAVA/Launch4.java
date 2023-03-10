import java.lang.reflect.Array;
import java.util.Arrays;

class Demo
{
	public static void disp1()
	{
		System.out.println("Static method");
	}
	public void disp2()
	{
		System.out.println("non static method");
	}
	
}


public class Launch4 {

	public static void main(String[] args) {
		
		Demo.disp1();
		
		
		//Thread.sleep(1000);
		//Arrays.sort(null);
		
		
		
		Demo d=new Demo();
		d.disp1();
		d.disp2();

	}

}
