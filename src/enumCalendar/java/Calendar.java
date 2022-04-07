package enumCalendar.java;

import java.time.LocalDate;
import java.time.Month;

public class Calendar {
	public static void main(String args[]){
	    Month month = Month.from(LocalDate.now());  
	    System.out.println(month.getValue());  
	    System.out.println(month.name());
	    System.out.println("So ngay trong thang:");
	    System.out.println(month.length(true));
	    //plus() method, thang sau
	    System.out.println(month.plus(1));  
	    //minus() method, thang truoc
	    System.out.println(month.minus(1));  
	}  
}
