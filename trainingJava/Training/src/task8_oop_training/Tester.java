package task8_oop_training;

import java.util.Scanner;

public class Tester {

	private int id;
	private int salary;
	private int age;
	private String name;
	private int expirienceInYears;

	public Tester(int age) {
		this.age=age;
	}
	
	public Tester(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public Tester(int salary, int age, String name) {
		this.salary=salary;
		this.age=age;
		this.name=name;
	}
	
	public int getExpirienceInYears() {
		return expirienceInYears;
	}

	public void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

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

	int experienece() {
		System.out.println("Enter expeirence:");
		Scanner value = new Scanner(System.in);

		int experienceInMonths = value.nextInt() * 12;
		value.close();
		return experienceInMonths;
	}

}
