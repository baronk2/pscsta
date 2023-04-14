/*
Kevin Baron
12/14/12
Astronomical Units
*/

import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;

public class KWBaron_Astro {
	
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("astro.dat"));
		int reps = file.nextInt();
		BigInteger converter = new BigInteger("149597871000");
		file.nextLine();
		for (int n = 1; n <= reps; n++) {
			String description = file.nextLine();
			BigInteger au = new BigInteger(file.nextLine());
			BigInteger meters = au.multiply(converter);
			String metersString = "" + meters;
			String metersWithCommas = "";
			int length = metersString.length();
			int stop = length % 3;
			if (stop == 0) {
				stop = 3;
			}//eo if
			metersWithCommas += metersString.substring(0, stop);
			int start = stop;
			for (int i = 1; i <= (length - 1) / 3; i++) {
				stop = start + 3;
				metersWithCommas += "," + metersString.substring(start, stop);
				start = stop;
			}//eo for
			System.out.println(description + " = " + metersWithCommas + " meters");
		}//eo for
	}//eo main
	
}//eo class