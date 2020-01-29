
public class Automation_course_3 {

	public static void main(String[] args) {

	}

//	Задание:
//		Совместное решение:
//		Написать метод, который принимает два числа a и b, выводит на экран результат их сложения
	static void sum(int a, int b) {
		System.out.println(a + b);
	}

//		Написать метод, который принимает три числа a, b, c. Выводит на экран их произведение.
	static void mult(int a, int b, int c) {
		System.out.println(a * b * c);
	}


//		Написать метод, которые выводит любой переданный массив в обратном порядке

	static int[] arr(int[] a) {
		int[] b = new int[a.length];
		for (int i = a.length; i > -1; i--) {
			b[i] = a[i];
		}
		return b;
	}

}
