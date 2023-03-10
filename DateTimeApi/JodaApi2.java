package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JodaApi2 {

	public static void main(String[] args) {
	 
		LocalDate ld=LocalDate.of(2022, 10, 31);
		System.out.println(ld);
		System.out.println(ld.getDayOfMonth() + ":" + ld.getDayOfYear()+":"+
		   ld.getDayOfWeek() + ":" + ld.getMonthValue() + ":"+
				ld.getYear());
		
		System.out.println();
		LocalDate ld1=LocalDate.of(2003, Month.APRIL, 4);
		System.out.println(ld1);
		
		LocalTime lt= LocalTime.of(12, 34, 45);
		System.out.println(lt);
		
		LocalDateTime ldt=LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		System.out.println();
		LocalDateTime ldt1=LocalDateTime.of(2003, 4, 4, 7, 45,55,897543543);
		System.out.println(ldt1);

	}

}
