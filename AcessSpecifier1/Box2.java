package AcessSpecifier1;

public class Box2 {

	protected static int i = 10;
	int j;
	
	protected static void show() {
		System.out.println("show in box 2");
	}
	
	protected void add() {
		System.out.println(i+i);
	}
}
