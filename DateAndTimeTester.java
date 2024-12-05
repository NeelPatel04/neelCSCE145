//Neel Patel

import java.util.Scanner;

public class DateAndTimeTester {

	//Extracts the minute from a given time string in hh:mm format
	public int getMinute(String time) {
		String minute = time.substring(time.indexOf(":") + 1).trim();
		int numMinute = Integer.parseInt(minute);
		return numMinute;
	}

	//Extracts the hour from a given time string in hh:mm format
	public int getHour(String time) {
		String hour = time.substring(0, time.indexOf(":"));
		int numHour = Integer.parseInt(hour);
		return numHour;
	}

	//Extracts the day from a given date string in MM/DD format
	public int getDay(String date) {
		String day = date.substring(date.indexOf("/") + 1).trim(); 
		int numDay = Integer.parseInt(day);
		return numDay;
	}

	//Extracts the month from a given date string in MM/DD format
	public int getMonth(String date) {
		String month = date.substring(0, date.indexOf("/"));
		int numMonth = Integer.parseInt(month);
		return numMonth;
	}

	//Validates if the time is in the correct range
	public boolean isValidTime (String time) {
		int hour = getHour(time);
		int min = getMinute(time);
		return(hour >= 1 && hour <= 12) && (min >= 0 && min <= 59);
	}

	//Validates if the date is in the correct range
	public boolean isValidDate (String date) {
		int month = getMonth(date);
		int day = getDay(date);
		if(month < 1 || month > 12 || day < 1 || day > 31) {
			return false;
		}
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			return false; 
		}
		if (month == 2 && day > 28) {
			return false;
		}
		return day <= 31;

	}

	//Validates the overall input format of date and time
	public boolean isValid(String i) {
		String[] parts = i.split(" ");
		if (parts.length != 2) {
			return false;
		}
		String datePart = parts[0];
		String timePart = parts[1];
		return isValidDate(datePart) && isValidTime(timePart);
	}

	//Main method to run (MM/DD hh:mm) validation program.
	public void run () {
		Scanner k = new Scanner(System.in);
		String i;
		while(true) {
			System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid:");
			i = k.nextLine();
			if(isValid(i)) {
				System.out.println("The date and time is valid!");
			}
			else {
				System.out.println("The date and time is not valid!");	
			}
			System.out.println("Would you like to exit? Type (quit) to exit or press [ENTER] to continue.");
			String exit = k.nextLine();
			if (exit.equalsIgnoreCase("quit")) {
				System.out.println("Good bye");
				break;
			}	
		}
		k.close();
	}
}


