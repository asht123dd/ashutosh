package learn.ind;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("About to test the method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testing Over");
	}

	@Test
	public final void testAdd() {
		Calculator c = new Calculator();
		assertEquals(40, c.add(20, 10));
	}

}
