package task9_inheritance;

public class Planet extends SolarSystem{

	private int size;
	private String theBiggest;
	
	
	public Planet(String universeName, int size) {
		super(universeName);
		this.size=size;
	}

	public int getSize() {
		return this.size;
	}
	
	public void prinTheBiggest() {
		System.out.println(this.theBiggest);
	}
	
}
