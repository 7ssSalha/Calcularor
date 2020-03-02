package cal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



import cal.Calculator;

@SuppressWarnings("unused")
public class Testcase {

	@Test
	public void test() {
		Calculator c = new Calculator();
		assertEquals(c.add(2,3),5);
		
	}

}
