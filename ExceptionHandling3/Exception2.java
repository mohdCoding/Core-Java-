package ExceptionHandling3;
import java.util.*;

class UnderAgeException extends Exception {
	
	UnderAgeException(String msg){
		super(msg);
	}
}
class OverAgeException extends Exception {
	
	OverAgeException(String msg){
		super(msg);
	}
}
class LApp {
	
  private int age;
  
  public void input() {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Dear Kindly enter your age");
	  age = in.nextInt();
  }
  
  public void verify() throws UnderAgeException, OverAgeException{
	  
	  if(age >= 18 && age <= 60) {
		  System.out.println("You're eligible to get liscence");
	  }else if(age < 18) {
		  throw new UnderAgeException("You need to grow more");
	  }else if(age > 60) {
		  throw new OverAgeException("Your age is exceeded to get Liscence");
	  }
  }
	
	
}

class RTO {
	
	public void initiate() {
		LApp lapp = new LApp();
		try {
		   lapp.input();
		   lapp.verify();
		}catch(UnderAgeException | OverAgeException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			try {
			 lapp.input();
			 lapp.verify();
			}catch(UnderAgeException | OverAgeException f) {
				System.out.println("Seems Suspicious");
				System.exit(0);
			}
		}
	}
}
public class Exception2 {

	public static void main(String[] args) {
		
       RTO rto = new RTO();
       rto.initiate();
	}

}
