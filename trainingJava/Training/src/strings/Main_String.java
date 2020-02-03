package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nubmer of words: ");
		int n = sc.nextInt();
		int numberOfChars = 0;
		String longest = "";
		ArrayList<String> array = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter your word: ");
			String str = sc.next();

			System.out.println("Your word is: " + str + "\nwith number of chars: " + str.length() + " ");

			if (numberOfChars < str.length()) {
				numberOfChars = str.length();
				longest = str;
			}
			if (numberOfChars == str.length()) {
				array.add(str);
			}

		}
		System.out.println("===========================================");
		if (array.size() == 0) {
			System.out.println("The longest word is: " + longest + "\nwith number of chars: " + numberOfChars + " ");
		} else {
			System.out.println("The longest words are: " + array + "\nwith number of chars: " + numberOfChars + " ");
		}
		sc.close();
	}

}
