package DateTimeApi;

import java.time.*;

public class LaunchZoneID {

	public static void main(String[] args) {
		
		ZoneId zd= ZoneId.systemDefault();
		System.out.println(zd);
		
		ZoneId zd1= ZoneId.of("America/Los_Angeles");
		System.out.println(zd1);
		
		ZonedDateTime zt = ZonedDateTime.now(zd1);
		System.out.println(zt);
		
		ZonedDateTime zt1 = ZonedDateTime.now();
		System.out.println(zt1);
		
		
		
		
		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(2003, Month.APRIL, 4);
		Period p= Period.between(bday,today);
		System.out.println("year :" + p.getYears() + ", month: " + p.getMonths()+
				", date: " + p.getDays());
		
		System.out.println();
		
		 int n = 2022;
		  Year y=Year.of(n);
		  if(y.isLeap()) 
			System.out.printf("%d is Leap year",n); 
		 else 
			System.out.printf("%d is not Leap year",n); 
		

	}

}
