package com.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

	Calc calc = null;

	@Before
	public void setup() {
		calc = new Calc();
	}

	@Test
	public void add() {
		int a = 12;
		int b = 13;
		int actual = (int) calc.add(a, b);
		int expected = 25;
		Assert.assertEquals(expected, actual);
	}

}
