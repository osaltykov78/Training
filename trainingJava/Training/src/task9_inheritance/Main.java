package task9_inheritance;

public class Main {

	public static void main(String[] args) {
		
		notDefinedArgs(5, 2, 3, 4, 5);

	}

	public static void notDefinedArgs(int... args) {
		System.out.println(args.length);
	}
}
