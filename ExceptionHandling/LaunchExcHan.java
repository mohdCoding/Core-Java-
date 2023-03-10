package ExceptionHandling;

import java.util.*;


public class LaunchExcHan {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
         try {
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
	
		int res = num1 / num2;
		
		System.out.println(res);
		
		
		System.out.println("Enter the size of an array");
		int size = in.nextInt();
		
		int[] ar = new int[size];
		System.out.println("Enter the element to be inserted");
		int element = in.nextInt();
		System.out.println("Enter the position to insert the element");
		int position  = in.nextInt();
		
		ar[position] = element;
         }catch(ArithmeticException e) {
        	 System.out.println("num2 cannot be zero");
         }catch(ArrayIndexOutOfBoundsException e) {
        	 System.out.println("Be in your limit");
         }catch(NegativeArraySizeException e) {
        	 System.out.println("negative size not allowed");
         }catch(Exception e) {
        	 System.out.println("common error");
         }
         
         System.out.println("Execution completed");
	}

}
