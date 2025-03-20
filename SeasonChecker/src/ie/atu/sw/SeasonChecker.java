package ie.atu.sw;

import java.time.*; //or import java.time.LocalDate;

public class SeasonChecker {
	
	public String getSeason(LocalDate date) {
		Month month = date.getMonth();
		
		//Switch expression, not a switch statement
		return switch(month) {
			case FEBRUARY, MARCH, APRIL 		-> "Spring";
			case MAY, JUNE, JULY 				-> "Summer";
			case SEPTEMBER, OCTOBER 			-> "Autumn";
			case NOVEMBER, DECEMBER, JANUARY 	-> "Winter";
			default 							-> {
				if (month == Month.AUGUST && date.getDayOfMonth() < 20) {
					yield "Holiday Season";
				}else {
					yield "Autumn";
				}
			}
		}; //; required after curly brackets that contain an expression
	}
	
}
