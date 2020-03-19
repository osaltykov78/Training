package task9_inheritance;

public class Main {

	public static void main(String[] args) {
		String universe = "UNIVERSE";
		int size=1500;
		notDefinedArgs(5, 2, 3, 4, 5);
		SolarSystem ss = new SolarSystem(universe);
		System.out.println(ss.getUniverseName());
		Planet pl=new Planet(universe, size);
		System.out.println(pl.getSize());
	}

	public static void notDefinedArgs(int... args) {
		System.out.println(args.length);
	}
}
