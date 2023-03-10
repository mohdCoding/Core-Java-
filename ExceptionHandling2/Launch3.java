package ExceptionHandling2;
import java.util.*;

class Things{
	
	public void operation() throws InputMismatchException, NegativeArraySizeException {
		
		try {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Enter the size of the array");
	    int size = in.nextInt();
	    
	    int[] arr = new int[size];
	    
	    System.out.println("Enter the element to be added in an array");
	    
	    int element = in.nextInt();
	    
	    System.out.println("Enter the position to add the element");
	    
	    int position = in.nextInt();
	    
	    arr[position] = element;
	    
	    System.out.println("Element added in the " + position + "position sucessfully");
		}catch(NegativeArraySizeException e) {
			System.out.println("Array size cannot be negative -- operation method only");
			 throw e;
		}catch(InputMismatchException e) {
			System.out.println("Input must be whole numbers -- operation method only");
			throw e;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Know your limit -- operation method only");
		}catch(Exception e) {
			System.out.println("Exception handled in operation method only");
		}finally {
			System.out.println("Thanks for using this application");
		}
	}
	
       public void operation2() throws  ArrayIndexOutOfBoundsException,
                                        InputMismatchException,
                                        NegativeArraySizeException,
                                        Exception
       {
		
		
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Enter the size of the array");
	    int size = in.nextInt();
	    
	    int[] arr = new int[size];
	    
	    System.out.println("Enter the element to be added in an array");
	    
	    int element = in.nextInt();
	    
	    System.out.println("Enter the position to add the element");
	    
	    int position = in.nextInt();
	    
	    arr[position] = element;
	    
	    System.out.println("Element added in the " + position + "position sucessfully");
		System.out.println("thanks for using operation2 method");
	}
}
public class Launch3 {

	public static void main(String[] args) {
	
		 Things t = new Things();
		 
		 try {
		 t.operation();
		 }catch(InputMismatchException e) {
			 System.out.println("input must be in whole numbers -- handled in main method");
		 }catch(NegativeArraySizeException e) {
			 System.out.println("array size cannot be negative -- handle in main method");
		 }
         
		 try {
		      t.operation2();
		 }catch(ArrayIndexOutOfBoundsException e) {
			 
		 }catch(InputMismatchException e) {
			 
		 }catch(NegativeArraySizeException e) {
			 
		 }catch(Exception e) {
			 
		 }
	}

}
