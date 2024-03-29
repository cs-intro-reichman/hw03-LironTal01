/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    //int debugDaysCounter = 0; 
		int sumSunday1 = 0;
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year<2000) {
			for(int j = 1; j <= 12; j++){
	 		for (int i=1; i<=nDaysInMonth(month,year); i++) {	
				if (i == 1 && dayOfWeek == 1) {
					sumSunday1++;
				}
				if (dayOfWeek==1) {
					System.out.println(i+"/" + month + "/" + year + " is Sunday");
						dayOfWeek++;
						
				}
				else if (dayOfWeek==7){
					dayOfWeek = 1;
					System.out.println(i+"/" + month + "/" + year);
				}
				else {
					System.out.println(i+"/" + month + "/" + year);
					dayOfWeek++;
				}
				
			}
			month++;
			dayOfMonth = 1;
			

			
		}
		
		month= 1;
		year++;		
			
	 		
        }
	 	System.out.println("During the 20th century, " + sumSunday1 + " Sundays fell on the first day of the month");
	 }
	
	 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear;
		// Checks if the year is divisible by 400
			isLeapYear = ((year % 400) == 0);
		// Then checks if the year is divisible by 4 but not by 100
			isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
	
			return isLeapYear;
		
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int numOfDays;

		if(isLeapYear(year)){
			switch (month) {
				case 1: numOfDays = 31;
						break;
				case 2: numOfDays = 29;
						break;
				case 3: numOfDays = 31;
						break;
				case 4: numOfDays = 30;
						break;
				case 5: numOfDays = 31;
						break;
				case 6: numOfDays = 30;
						break;
				case 7: numOfDays = 31;
						break;
				case 8: numOfDays = 31;
						break;
				case 9: numOfDays = 30;
						break;
				case 10: numOfDays = 31;
						break;
				case 11: numOfDays = 30;
						break;
				case 12: numOfDays = 31;
						break;
			
				default:numOfDays = 0;
					break;

			}
		}
			else{
			switch (month) {
				case 1: numOfDays = 31;
						break;
				case 2: numOfDays = 28;
						break;
				case 3: numOfDays = 31;
						break;
				case 4: numOfDays = 30;
						break;
				case 5: numOfDays = 31;
						break;
				case 6: numOfDays = 30;
						break;
				case 7: numOfDays = 31;
						break;
				case 8: numOfDays = 31;
						break;
				case 9: numOfDays = 30;
						break;
				case 10: numOfDays = 31;
						break;
				case 11: numOfDays = 30;
						break;
				case 12: numOfDays = 31;
						break;
			
				default:numOfDays = 0;
					break;
			
			}
		}
		
			return numOfDays;
		
	}
}