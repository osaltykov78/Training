package oop_training;

import java.util.Scanner;

public class Massive {

	public void printReverseMassiveAsLine(int[] arr) {
		System.out.println("Reversed array:");
		for (int i = arr.length - 1; i > -1; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public void getSumOfElements(int[] arr) {

		System.out.println("Sum of all elements array:");

		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

	public void multiptyBy3(int[] arr) {

		System.out.println("Multiply all elements by 3 in array:");

		for (int i = 0; i<arr.length; i++) {
			arr[i] = arr[i] * 3;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
