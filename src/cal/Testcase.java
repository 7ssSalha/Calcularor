package cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testcase {

	@Test
	void test() {
		Calculator c = new Calculator();
		assertEquals(c.add(2,3),5);
	}

}
