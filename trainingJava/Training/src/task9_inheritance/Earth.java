package task9_inheritance;

public class Earth extends Planet {

	private int age;
	private String shape;

	public Earth(String universeName, int age) {
		super(universeName, age);
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getShape() {
		return this.shape;
	}

}
