package DateTimeApi;

import java.time.*;
public class JodaTimeApi {

	public static void main(String[] args) {
       
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getYear());
		System.out.println();
		
		LocalTime lt= LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());
	    System.out.println();
	    
	    LocalDateTime ldt = LocalDateTime.now();
	    System.out.println(ldt);
	    System.out.println(ldt.getDayOfMonth());
	    System.out.println(ldt.getDayOfYear());
	    System.out.println(ldt.getMonthValue());
	    System.out.println(ldt.getYear());
	    System.out.println(ldt.getHour());
	    System.out.println(ldt.getMinute());
	    System.out.println(ldt.getSecond());
	    System.out.println(ldt.getNano());
	    
	    
		

	}

}
