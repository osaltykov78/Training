package oop_training;

public class Tester {

	private int id;
	private int salary;
	private String age;
	private String name;

	public void getId() {
		System.out.println(id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void getSalary() {
		System.out.println(salary);
	}

	public void getName() {
		System.out.println(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getCleanSalary(int salary) {
		int newSalary = (int) (salary - salary * 0.20);
		System.out.println(newSalary);
	}

}
