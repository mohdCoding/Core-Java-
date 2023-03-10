package ExceptionHandling3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Telsuko {
	
	
	public void display()  {
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			/*
			3. All resources reference variable are been made as final automatically when they 
			are used, so we can't
			 re-assign the reference of the Resource Variable.
			 if we do so it will result in compile time error
			 */
			// br = new BufferedReader(new InputStreamReader(System.in));
		}catch(Exception e) {
			
		}
		
	}
	
	public void add() throws IOException {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
		}
		
		
	}
	
public void find() throws IOException {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)))
		{
			
		}
		
		
	}
}
public class ExceptionTR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
