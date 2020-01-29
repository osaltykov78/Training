package testClasses;

import org.testng.annotations.Test;

import testPage.TestPageClass;
import java.util.stream.*;
public class TesrClassA {

	TestPageClass tpc;

	@Test
	public void tesTest() {
		tpc = new TestPageClass();
		tpc.sayMeooo();
		doSomeThing();

	}

	public void main(String[] args) {
		IntStream
				.range(1,10)
				.forEach(System.out::print);
		System.out.println();
	}
	
	public void doSomeThing() {

		tpc.sayMeooo();
	}
}
