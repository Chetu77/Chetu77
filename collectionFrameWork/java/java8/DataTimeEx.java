package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DataTimeEx {

	

	public static void main(String[] args) {
		LocalDate todayDate= LocalDate.now();
		System.out.println("today date is:"+LocalDate.now());
		LocalDate firstDay_2023=LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("specific  date:"+firstDay_2023);
		
		LocalTime todayTime=LocalTime.now();
		System.out.println("today time is:"+LocalTime.now());
		
		LocalDateTime todayDateTime=LocalDateTime.now();
		System.out.println("today date an time is:"+LocalDateTime.now());

	}

	

}
