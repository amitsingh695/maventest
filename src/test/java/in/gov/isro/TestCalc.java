package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int result = calc.add(5, 5);
		assertEquals(10, result);
	}
	@Test
	public void test1() {
		Calculator calc = new Calculator();
		int result = calc.multiply(5, 5);
		assertEquals(25, result);
	}
	@Test
	public void test2() {
		Calculator calc = new Calculator();
		int result = calc.subtract(5, 5);
		assertEquals(0, result);
	}
	@Test
	public void test3() {
		Calculator calc = new Calculator();
		int result = calc.divide(18, 6 );
		assertEquals(4, result);
	}

}
