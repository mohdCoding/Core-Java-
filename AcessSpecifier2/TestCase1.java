package AcessSpecifier2;

import AcessSpecifier1.*;


public class TestCase1 extends Box2{


	
	public static void main(String args[]) {
		Box b = new Box();
		b.disp();
		
		int c = b.a = 10;
		System.out.println(c);
		
		Box2 bb = new Box2();
		bb.i = 30;
		
	}
	
	
}
