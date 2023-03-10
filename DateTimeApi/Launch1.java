package DateTimeApi;

import java.util.Date;
import java.sql.*;

public class Launch1 {

	public static void main(String[] args) {
		
         Date utilDate=new Date();
         System.out.println(utilDate);
         
      
         long ms = utilDate.getTime();
         System.out.println(ms + "ms");
         
         Date longDate=new Date(ms);
         System.out.println("long date: " + longDate);
         
         Date sqlDate=new Date(ms);
         System.out.println(sqlDate);
         
         Time time=new Time(ms);
         System.out.println(time);
         
         java.util.Date dddd=new java.util.Date(2003, 3, 3, 4, 4);
         System.out.println("dddd is :"+dddd);
        
         
         
         Time time2=new Time(12,45,45);
         System.out.println(time2);
         
         Timestamp timeStamp=new Timestamp(2021,10,31,3,45,55,12);
         System.out.println(timeStamp);
         
         java.sql.Date ss=new java.sql.Date(0, 0, 0);
         
         
	}

}
