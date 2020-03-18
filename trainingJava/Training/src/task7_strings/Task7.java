package task7_strings;

import java.util.Scanner;

import task7_strings.StringContainer;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of String array:");
		StringContainer2 stringContainer2 = new StringContainer2(Integer.parseInt(input.nextLine()));
		for (int i = 0; i < stringContainer2.getLengthOfArray(); i++) {
			System.out.println("Enter element of String array:");
			stringContainer2.setElementOfStringArray(i, input.nextLine());
		}

		System.out.println("First string with unique chars: " + stringContainer2.getCountOfUniqueSymbols());

		input.close();
	}

}
