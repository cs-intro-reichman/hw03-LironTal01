public class Calendar {
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
        int year = Integer.parseInt(args[0]);
        int yearCounter = 1900;
	
		int sumSunday1 = 0;
	   
        while (yearCounter <= year) {
			for(int j = 1; j <= 12; j++){
	 		for (int i=1; i<=nDaysInMonth(month,yearCounter); i++) {	
				if (dayOfWeek==1) {
                    dayOfWeek++;
					if (yearCounter == year) {
                        System.out.println(i+"/" + month + "/" + year + " is Sunday");
                    }
						
						
				}
				else if (dayOfWeek==7){
					dayOfWeek = 1;
                    if (yearCounter == year) {
                    System.out.println(i+"/" + month + "/" + year);
                    }
					
				}
				else {
                    dayOfWeek++;
					if (yearCounter == year) {
                    System.out.println(i+"/" + month + "/" + year);
                    }
					
				}
				
			}
			month++;
			dayOfMonth = 1;
			

			
		}
		
		month= 1;
		yearCounter++;		
			
	 		
        }
        
	 }	
			
			
	 		//advance();
			//debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		//if (debugDaysCounter==100)  
	 		//	break;
	 		
	 		
        
	 	//// Write the necessary ending code here
	 
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 //private static void advance() {
		// Replace this comment with your code
	// } 
		 
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
