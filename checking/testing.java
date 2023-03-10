package checking;

@FunctionalInterface
interface Fi{
	
	void add();

	
	default void sum(int ...a) {
		
	}
}

class a {
	void sub() {
		
	}
	
}
public class testing {
     
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		
		 
		 Fi d = new Fi() {
			 public void add() {
				 System.out.println("implemented");
			 }
		};
		
		d.add();
		
		a g = new a() {
			public void sub() {
				System.out.println("overrided");
			}
		};
		g.sub();
		

	}

}





