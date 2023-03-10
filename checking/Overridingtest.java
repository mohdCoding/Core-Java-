package checking;
 
interface one {
	void add();
}

class ok {
	
	public void show() {
		System.out.println("show in ok");
	}
}

class Demo extends ok implements one{
	 
	 @Override
	 public void show() {
		 System.out.println("shwo in demo");
	 }
	 
	 @Override
	 public void add() {
		 System.out.println("add in demo");
	 }
	 
	 
 }
public class Overridingtest {

	public static void main(String[] args) {
		one o = new Demo();
		o.add();
	}

}
