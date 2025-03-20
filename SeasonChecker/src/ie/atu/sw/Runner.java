package ie.atu.sw;

import java.time.LocalDate;
import java.time.Month;

public class Runner {
	
	public static void main(String[] args) {
		var sc = new SeasonChecker();
		/*
		 * use ctrl + space to import LocalDate when typing
		 * 
		 * use dot notation and "of",
		 * select option with "Month" (rather than int for month)
		 * 
		 * add year and day in decimals
		 * use ctrl + space while typing month(eg aug)
		 * select AUGUS to import java.time.Month
		 */
		String season = sc.getSeason(LocalDate.of(1999, Month.AUGUST, 20));
		//LocalDate = one argument comprising of three values (year, month, day)
		System.out.println(season);
	}
	
}
