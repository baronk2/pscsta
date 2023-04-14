/*
Kevin Baron
12/14/12
Cosmic Day
*/

import java.util.Scanner;
import java.io.*;

public class KWBaron_Cosmic {
	
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("cosmic.dat"));
		int n = file.nextInt();
		file.nextLine();
		for (int reps = 1; reps <= n; reps++) {
			String date = file.nextLine();
			String monthString = date.substring(0,2);
			String dayString = date.substring(3);
			int monthInt = (int) (monthString.charAt(0) - 48) * 10;
			monthInt += (int) (monthString.charAt(1) - 48);
			int dayInt =  (int) (dayString.charAt(0) - 48) * 10;
			dayInt += (int) (dayString.charAt(1) - 48);
			int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int dayNumber = 0;
			for (int i = 0; i < monthInt - 1; i++) {
				dayNumber += daysInMonths[i];
			}//eo for
			dayNumber += dayInt - 1;
			double time = dayNumber * 24. / 365.;
			int hourInt = (int) time;
			String hourString = "" + hourInt;
			if (hourInt < 10) {
				hourString = "0" + hourString;
			}//eo if
			int minuteInt = (int) ((time % hourInt) * 60);
			String minuteString = "" + minuteInt;
			if (hourInt < 10) {
				minuteString = "0" + minuteString;
			}//eo if
			System.out.println(hourString + ":" + minuteString);
		}//eo for
	}//eo main
	
}//eo class