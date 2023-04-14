/*
Kevin Baron
12/15/12
Taxi Taxi
*/

import java.util.Scanner;
import java.io.*;

public class KWBaron_Taxi_Taxi {
	
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("taxi.dat"));
		int reps = file.nextInt();
		for (int n = 1; n <= reps; n++) {
			file.nextLine();
			double miles = file.nextDouble();
			int minutes = file.nextInt();
			double milesCost = 0.5;
			double fifthMiles = miles * 5;
			double fifthMilesAfter = fifthMiles - 1;
			int chargeable = (int) fifthMilesAfter;
			milesCost += chargeable * 0.22;
			if (fifthMilesAfter % chargeable > 0) {
				milesCost += 0.22;
			}//eo if
			double minutesCost = 0;
			minutesCost += (minutes / 60) * 0.2;
			if (minutes > (minutes / 60) * 60) {
				minutesCost += 0.2;
			}//eo if
			double totalCost = minutesCost + milesCost;
			System.out.printf("$%.2f\n", totalCost);
		}//eo for
	}//eo main
	
}//eo class