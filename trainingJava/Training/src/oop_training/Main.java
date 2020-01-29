package oop_training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Tester tester = new Tester();
//		Scanner sc = new Scanner(System.in);
//		int salary = sc.nextInt();
//		tester.getCleanSalary(salary);

		System.out.println("Enter number of elements in array:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int[] arrNew = new int[number];

		for (int i = 0; i<arrNew.length; i++) {
			arrNew[i] = (int) (Math.random() * 10);
			System.out.print(arrNew[i] + " ");
		}
		
		System.out.println();

		Massive array = new Massive();
		array.printReverseMassiveAsLine(arrNew);
		array.getSumOfElements(arrNew);
		array.multiptyBy3(arrNew);
	}

}
