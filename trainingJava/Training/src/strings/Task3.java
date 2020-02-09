package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();

		ArrayList<String> arr = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Attempt " + i + ". Enter any word");
			String str = sc.next();
			arr.add(str);
		}
		System.out.println("Initial array: " + arr);
		sc.close();

		int total = 0;
		String averageString = "";

		for (int i = 0; i < arr.size(); i++) {
			total += arr.get(i).length();
		}
		int average = total / arr.size();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).length() == average) {
				averageString = arr.get(i);
			} else if (arr.get(i).length() < average) {
				System.out.println("less than average: " + arr.get(i) + " with length: " + arr.get(i).length());
			} else if (arr.get(i).length() > average) {
				System.out.println("more than average: " + arr.get(i) + " with length: " + arr.get(i).length());
			}
		}

		System.out.println("average word is: " + averageString);
		System.out.println("average char number: " + average);

	}

}
