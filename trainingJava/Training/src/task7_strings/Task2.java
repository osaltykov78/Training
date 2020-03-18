package task7_strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();

		ArrayList<String> arr = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Attempt "+i+". Enter any word");
			String str = sc.next();
			arr.add(str);
		}
		System.out.println("Initial array: " + arr);
		sc.close();

		arr.sort((first, second) -> Integer.compare(first.length(), second.length()));

		System.out.println("Array ascending: " + arr);

		Collections.reverse(arr);
		System.out.println("Array descending: " + arr);

	}

}
