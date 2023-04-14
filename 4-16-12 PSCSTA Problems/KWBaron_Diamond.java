/*
Kevin Baron
12/14/12
Hollow Diamond
*/

import java.util.Scanner;
import java.io.*;

public class KWBaron_Diamond {
	
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("diamond.dat"));
		int reps = file.nextInt();
		for (int n = 1; n <= reps; n++) {
			file.nextLine();
			int size = file.nextInt();
			if (size == 1) {
				System.out.println("*");
			}//eo if
			for (int i = 1; i < size; i++) {
				if (i > 1) {
					System.out.print("*");
					for (int j = 1; j <= i - 2; j++) {
						System.out.print(" ");
					}//eo for
				}//eo if
				System.out.println("*");
			}//eo for
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}//eo for
				if(i < size - 1) {
					System.out.print("*");
					for (int j = 0; j < size - 2 - i; j++) {
						System.out.print(" ");
					}//eo for
				}//eo if
				System.out.println("*");
			}//eo for
			System.out.println();
		}//eo for
	}//eo main
	
}//eo class