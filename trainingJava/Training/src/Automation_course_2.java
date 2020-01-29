import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Automation_course_2 {

	public static void main(String[] args) {

//		IntStream.range(1, 11).forEach(System.out::println);
//		System.out.println();

//		String a = "heads";
//		String b = "tails";
//		double rand;
//		int c = 0;
//		int d = 1;
//		for (int i = 0; i < 100; i++) {
//
//		rand = (double) Math.random();
////		int random_number = c + (int) (rand * d);
//		
//		System.out.println("Random number: " + rand);
//
//		if (rand < 0.5) {
//			System.out.println(a);
//
//		} else {
//			System.out.println(b);
//
//		}
//
//		
//	
//System.out.println("========================================================");		
//		}

		Scanner in = new Scanner(System.in);
		int[] arr = null;
		int[] arr2 = { 1, 2, 3, 4, 5 };

		int n = 1;
		while (n < 5) {

			int number = in.nextInt();
			if (number % 2 == 0) {
				arr = new int[number];
				break;
			} else {
				System.out.println("Please enter even number");
			}
		}

		// fill the array with random numbers
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * 10);
		}

//		print the array asc order
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

//	print the array revert order
		for (int i = arr.length - 1; i > -1; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

//3. multiply all elements
		int m = 0;
		int res = 1;
		while (m < arr.length) {
			res *= arr[m];
			m++;
		}

		System.out.println("The result of multiplication is " + res);

//		4. zero elements 
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}

		}
		if (count == 0)
			System.out.println("NO ZEROS");
		else {
			System.out.println("numbers of zeros " + count);
		}
		System.out.println();

//		5. multiply by 2 every third element
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % 3 == 0) {
				arr[i] = arr[i] * 2;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();

// 6. print out numbers of zero elements
		count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {

				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();

		if (count == 0)
			System.out.println("NO ZEROS");
		else {
			System.out.println("numbers of zeros " + count);
		}
		System.out.println("6. Changing 2 neighbor elements");

//		6. replace 2 neighbor elements 
		int temp = 0;
		for (int i = 0; i < arr.length; i += 2) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
//		7. 
		System.out.println("7. Changing first-last elements");
		temp = 0;
		int size = arr.length - 1;

		for (int i = 0; i < arr.length / 2; i++) {

			temp = arr[i];
			arr[i] = arr[size];
			arr[size] = temp;
			size--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

//		8. 
		System.out.println("8. max/min");

		int value = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > value) {
				value = arr[i];
				index = i;
			}
		}
		System.out.println("MAX " + value + " with index " + index);
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < value) {
				value = arr[i];
				index = i;
			}
		}
		System.out.println("MIN " + value + " with index " + index);

//10. if array is asc
		boolean isTrue = false;
		for (int i = 0; i < arr2.length - 1; i++) {

			if (arr2[i] < arr2[i + 1]) {
				isTrue = true;
			} else {
				isTrue = false;
				break;
			}
		}

		if (isTrue) {
			System.out.println("the array is ascending");
		} else
			System.out.println("the array is not ascending");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

//		11. change ele by half sum of neighbor elements
		System.out.println();
		System.out.println("change ele by half sum of neighbor elements ");

		for (int i = 0; i < arr.length - 2; i++) {

			arr[i] = (arr[i + 1] + arr[i + 2]) / 2;
			System.out.print(arr[i] + " ");
		}

		System.out.println();

//		12. shift all elements on 2 positions right
		
		System.out.println("shift all elements on 2 positions right");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int b[] = new int[arr.length];
		b[0] = arr[arr.length - 1];
		System.arraycopy(arr, 0, b, 1, arr.length - 1);
		System.arraycopy(b, 0, b, 1, b.length - 1);
		
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
		}

		System.out.println();

	}
}
