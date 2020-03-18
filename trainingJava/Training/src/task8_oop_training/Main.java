package task8_oop_training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Tester tester = new Tester(5);
		Tester tester2 = new Tester(6, "Ihar");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		tester.getCleanSalary(salary);
		tester2.getExpirienceInYears();
		sc.close();
		
//		System.out.println("Enter number of elements in array:");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//
//		int[] arrNew = new int[number];
//
//		for (int i = 0; i<arrNew.length; i++) {
//			arrNew[i] = (int) (Math.random() * 10);
//			System.out.print(arrNew[i] + " ");
//		}
//		
//		System.out.println();
//
//		Massive array = new Massive();
//		array.printReverseMassiveAsLine(arrNew);
//		array.getSumOfElements(arrNew);
//		array.multiptyBy3(arrNew);
	}

}
